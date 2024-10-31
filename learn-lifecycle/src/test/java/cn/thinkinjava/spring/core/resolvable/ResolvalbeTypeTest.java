package cn.thinkinjava.spring.core.resolvable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.DefaultBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.core.ResolvableType;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * 提供了对父类(getSuperType()),接口(getInterfaces()),泛型参数(getGeneric(int...))的访问
 * @see ResolvableType
 *
 * 参考资料:
 * Spring 是如何解析泛型 - ResolvalbeType
 * https://www.cnblogs.com/binarylei/p/10344262.html
 *
 * @author qiuxianbao
 * @date 2024/10/28
 * @since ace_1.4.2_20240611
 */
public class ResolvalbeTypeTest {

	private HashMap<Integer, List<String>> myMap;

	private Service<Double, Float> service;
	private List<List<String>> list;
	private Map<String, Map<String, Integer>> map;
	private List<String>[] array;

	@Test
	public void testSpring() {
		DefaultBootstrapContext bootstrapContext = new DefaultBootstrapContext();
		SpringApplication application = new SpringApplication();
		ApplicationStartingEvent applicationStartingEvent = new ApplicationStartingEvent(bootstrapContext, application, null);
		ResolvableType resolvableType = ResolvableType.forInstance(applicationStartingEvent);
		// org.springframework.boot.context.event.ApplicationStartingEvent
		// System.out.println(resolvableType);
	}

	@Test
	public void test() {
		// HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
		ResolvableType resolvableType = ResolvableType.forClass(HashMap.class);
		// java.util.HashMap<?, ?>
		System.out.println("forClass \t" + resolvableType);

		// 1. getInterfaces 获取接口
		// [java.util.Map<?, ?>, java.lang.Cloneable, java.io.Serializable]
		System.out.println("getInterfaces \t" + Arrays.toString(resolvableType.getInterfaces()));
		Assertions.assertEquals(Map.class, resolvableType.getInterfaces()[0].resolve());

		// 2. getSuperType 获取父类
		Assertions.assertEquals(AbstractMap.class, resolvableType.getSuperType().resolve());

		// 3. as 向上转型 Map<K,V>
		// ResolvableType mapResolvableType = resolvableType.as(Map.class);
		ResolvableType mapResolvableType = resolvableType.asMap();
		// java.util.Map<?, ?>
		System.out.println("asMap \t" + mapResolvableType);
		Assertions.assertEquals(Map.class, mapResolvableType.resolve());

		// 4. getRawClass 当 type 是 ParameterizedType 时有效
		Assertions.assertEquals(Map.class, mapResolvableType.getRawClass());
		Assertions.assertEquals(HashMap.class.getGenericInterfaces()[0], mapResolvableType.getType());

		// 5. getGeneric 获取泛型 class ServiceImpl<A, B> implements Service<String, Integer>
		resolvableType = ResolvableType.forClass(ServiceImpl.class);
		// 当 Type 无法找到具体的 class 类型时返回 null
		Assertions.assertEquals("A", resolvableType.getGeneric(0).getType().getTypeName());
		Assertions.assertEquals(null, resolvableType.getGeneric(0).resolve());
		// 以下两种获取泛型的 Class 类型方式等价
		Assertions.assertEquals(String.class, resolvableType.as(Service.class).getGeneric(0).resolve());
		Assertions.assertEquals(String.class, resolvableType.as(Service.class).resolveGeneric(0));

		// 5. getComponentType 获取数组泛型 List<String>[] array
		resolvableType = ResolvableType.forField(ReflectionUtils.findField(getClass(), "array"));
		Assertions.assertEquals(List.class, resolvableType.getComponentType().resolve());

		// 构造类型
		ResolvableType resolvableType1 = ResolvableType.forClassWithGenerics(List.class, String.class);
		// ava.util.List<java.lang.String>
		System.out.println("forClassWithGenerics \t" + resolvableType1);

		ResolvableType resolvableType2 = ResolvableType.forArrayComponent(resolvableType1);
		// java.util.List<java.lang.String>[]
		System.out.println("forArrayComponent \t" + resolvableType2);
		resolvableType2.getComponentType().getGeneric(0).resolve();

		// List<String>[] array
		ResolvableType resolvableType3 = ResolvableType.forField(ReflectionUtils.findField(getClass(), "array"));
		Assertions.assertTrue(resolvableType3.isAssignableFrom(resolvableType2));
		Assertions.assertTrue(ResolvableType.forClass(Object.class).isAssignableFrom(ResolvableType.forClass(String.class)));
	}

	@Test
	public void forMethodTest() {
		// 1. 方法的返回值类型 private Map<Float, Map<Double, Integer>> method() {}
		ResolvableType returnType = ResolvableType.forMethodReturnType(ReflectionUtils.findMethod(ServiceImpl.class, "method"));
		// java.util.Map<java.lang.Float, java.util.Map<java.lang.Double, java.lang.Integer>>
		System.out.println("forMethodReturnType　\t" + returnType);
		Assertions.assertEquals(Double.class, returnType.getGeneric(1, 0).resolve());

		// 2. 构造器 ServiceImpl(List<List<String>> list, Map<Double, Map<Float, Integer>> map)
		ResolvableType parameterType = ResolvableType.forConstructorParameter(ClassUtils.getConstructorIfAvailable(ServiceImpl.class, List.class, Map.class), 0);
		// java.util.List<java.util.List<java.lang.String>>
		System.out.println("forConstructorParameter \t" + parameterType);
		Assertions.assertEquals(String.class, parameterType.getGeneric(0, 0).resolve());

		parameterType = ResolvableType.forConstructorParameter(ClassUtils.getConstructorIfAvailable(ServiceImpl.class, List.class, Map.class), 1);
		Assertions.assertEquals(Double.class, parameterType.getGeneric(0).resolve());
		Assertions.assertEquals(Float.class, parameterType.getGeneric(1, 0).resolve());
		Assertions.assertEquals(Integer.class, parameterType.getGeneric(1, 1).resolve());
	}

	@Test
	public void forFieldTest() throws Exception {
		// 1. Service<Double, Float> service
		Field filed = ReflectionUtils.findField(getClass(), "service");
		// private cn.thinkinjava.spring.core.resolvable.Service cn.thinkinjava.spring.core.resolvable.ResolvalbeTypeTest.service
		System.out.println("filed \t" + filed);

		Type genericType = filed.getGenericType();
		// cn.thinkinjava.spring.core.resolvable.resolvable.Service<java.lang.Double, java.lang.Float>
		System.out.println("getGenericType \t" + genericType);

		Class<?> declaringClass = filed.getDeclaringClass();
		// class cn.thinkinjava.spring.core.resolvable.ResolvalbeTypeTest
		System.out.println("getDeclaringClass \t" + declaringClass);

		ResolvableType resolvableTypeService = ResolvableType.forField(filed);
		// cn.thinkinjava.spring.core.resolvable.Service<java.lang.Double, java.lang.Float>
		System.out.println("forField \t" + resolvableTypeService);

		// getType() 保存原始的 Type 类型
		// cn.thinkinjava.spring.core.resolvable.Service<java.lang.Double, java.lang.Float>
		System.out.println("getGenericType \t" + filed.getGenericType());
		Assertions.assertEquals(filed.getGenericType(), resolvableTypeService.getType());

		// resolve() 对于 ParameterizedType 类型保存的是 <> 之前的类型，即 Service.class
		// interface cn.thinkinjava.spring.core.resolvable.Service
		System.out.println("ParameterizedType getRawType \t" + ((ParameterizedType) filed.getGenericType()).getRawType());
		// interface cn.thinkinjava.spring.core.resolvable.Service
		System.out.println("resolve \t" + resolvableTypeService.resolve());
		Assertions.assertEquals(((ParameterizedType) filed.getGenericType()).getRawType(), resolvableTypeService.resolve());

		// getGeneric() == getGeneric(0)
		System.out.println("getGeneric() \t" +  resolvableTypeService.getGeneric());
		System.out.println("getGeneric(0) \t" +  resolvableTypeService.getGeneric(0));
		Class<?> clazz = resolvableTypeService.getGeneric(0).resolve();
		Assertions.assertEquals(Double.class, clazz);


		// 2. List<List<String>> list
		ResolvableType resolvableTypeList = ResolvableType.forField(ReflectionUtils.findField(getClass(), "list"));
		// getGeneric(0).getGeneric(0) == getGeneric(0, 0)
		clazz = resolvableTypeList.getGeneric(0).getGeneric(0).resolve();
		Assertions.assertEquals(String.class, clazz);

		clazz = resolvableTypeList.getGeneric(0, 0).resolve();
		Assertions.assertEquals(String.class, clazz);


		// 3. Map<String, Map<String, Integer>> map
		ResolvableType resolvableTypeMap = ResolvableType.forField(getClass().getDeclaredField("map"));
		clazz = resolvableTypeMap.getGeneric(1).getGeneric(1).resolve();
		Assertions.assertEquals(Integer.class, clazz);

		// 4. List<String>[] array
		ResolvableType resolvableTypeArray = ResolvableType.forField(ReflectionUtils.findField(getClass(), "array"));
		Assertions.assertTrue(resolvableTypeArray.isArray());
		// java.util.List<java.lang.String>
		System.out.println("getComponentType \t" + resolvableTypeArray.getComponentType());
		// interface java.util.List
		System.out.println("resolve \t" + resolvableTypeArray.getComponentType().resolve());
		Assertions.assertEquals(List.class, resolvableTypeArray.getComponentType().resolve());
		Assertions.assertEquals(String.class, resolvableTypeArray.getComponentType().getGeneric(0).resolve());
	}

	@Test
	public void forClassTest() {
		ResolvableType resolvableType = ResolvableType.forClass(ServiceImpl.class);
		// cn.thinkinjava.spring.core.resolvable.ServiceImpl<?, ?>
		System.out.println("forClass \t" + resolvableType);

		// getType 保存原始的 Type 类型
		// class cn.thinkinjava.spring.core.resolvable.ServiceImpl
		System.out.println("getType \t" + resolvableType.getType());
		Assertions.assertEquals(ServiceImpl.class, resolvableType.getType());

		// resolve 将 Type 解析为 Class， 如果无法解析返回 null
		// class cn.thinkinjava.spring.core.resolvable.ServiceImpl
		System.out.println("resolve \t" + resolvableType.resolve());
		Assertions.assertEquals(ServiceImpl.class, resolvableType.resolve());
	}

}
