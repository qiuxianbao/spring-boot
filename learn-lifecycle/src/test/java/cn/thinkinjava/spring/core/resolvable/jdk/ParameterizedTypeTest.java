package cn.thinkinjava.spring.core.resolvable.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.*;

/**
 * 参数化类型
 *
 * @author qiuxianbao
 * @date 2024/11/01
 * @since ace_1.4.2_20240611
 */
public class ParameterizedTypeTest<T> {

	List<Set> a1;
	List<Set<String>> a2;
	List<T> a3;
	List<? extends Set> a4;
	List<Set<String>[]> a5;

	public void test(List<ArrayList<String>[]> a) {
	}

	/**
	 * JDK
	 * @see Method#getGenericParameterTypes()
	 *
	 *
	 * 获得<>前面实际类型
	 * @see java.lang.reflect.ParameterizedType#getRawType()
	 *
	 * 获得<>中实际类型
	 * @see ParameterizedType#getActualTypeArguments()
	 *
	 *
	 * @throws Exception
	 */
	@Test
	public void testParameterizedType() throws Exception {
		// List<ArrayList<String>[]> a
		Method method = getClass().getMethod("test", List.class);

		Type[] types = method.getGenericParameterTypes();
		// [java.util.List<java.util.ArrayList<java.lang.String>[]>]
		System.out.println(Arrays.toString(types));

		// 第1个入参
		ParameterizedType pType = (ParameterizedType) types[0];

		// 获得<>前面实际类型
		Type rawType = pType.getRawType();
		// interface java.util.List
		System.out.println(rawType);

		// 获得<>中实际类型
		Type[] actualTypeArguments = pType.getActualTypeArguments();
		// [java.util.ArrayList<java.lang.String>[]]
		System.out.println(Arrays.toString(actualTypeArguments));

		// sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl
		System.out.println(actualTypeArguments[0].getClass().getName());


		// List<Set> a1
		Field a1Field = getClass().getDeclaredField("a1");
		// java.util.List<java.util.Set>
		System.out.println("getGenericType \t" + a1Field.getGenericType());
		// interface java.util.List
		System.out.println("getType \t" + a1Field.getType());

		ParameterizedType genericType = (ParameterizedType) a1Field.getGenericType();
		// java.util.List<java.util.Set>
		System.out.println(genericType);


		// List<Set<String>> a2
		Field a2Field = getClass().getDeclaredField("a2");
		// java.util.List<java.util.Set<java.lang.String>>
		System.out.println("getGenericType \t" + a2Field.getGenericType());
		// interface java.util.List
		System.out.println("getType \t" + a2Field.getType());

		// -----------变量类型-----------
		// List<T> a3
		Field a3Field = getClass().getDeclaredField("a3");
		// java.util.List<T>
		System.out.println("getGenericType \t" + a3Field.getGenericType());
		// interface java.util.List
		System.out.println("getType \t" + a3Field.getType());

		ParameterizedType parameterizedType1 = (ParameterizedType) a3Field.getGenericType();
		Type[] actualTypeArguments2 = parameterizedType1.getActualTypeArguments();
		// true
		System.out.println("TypeVariable \t" + (actualTypeArguments2[0] instanceof TypeVariable));

		// -----------通配符-----------
		// List<? extends Set> a4
		Field a4Field = getClass().getDeclaredField("a4");
		// java.util.List<? extends java.util.Set>
		System.out.println("getGenericType \t" + a4Field.getGenericType());
		// interface java.util.List
		System.out.println("getType \t" + a4Field.getType());

		ParameterizedType parameterizedType4 = (ParameterizedType) a4Field.getGenericType();
		Type[] actualTypeArguments4 = parameterizedType4.getActualTypeArguments();
		// true
		System.out.println("WildcardType \t" + (actualTypeArguments4[0] instanceof WildcardType));

		// -----------数组-----------
		// list泛型中的类型是GenericArrayType
		// List<Set<String>[]> a5
		Field a5Field = getClass().getDeclaredField("a5");
		// java.util.List<java.util.Set<java.lang.String>[]>
		System.out.println("getGenericType \t" + a5Field.getGenericType());
		// interface java.util.List
		System.out.println("getType \t" + a5Field.getType());

		ParameterizedType parameterizedType5 = (ParameterizedType) a5Field.getGenericType();
		Type[] actualTypeArguments5 = parameterizedType5.getActualTypeArguments();
		// true
		System.out.println("GenericArrayType \t" + (actualTypeArguments5[0] instanceof GenericArrayType));


	}

}
