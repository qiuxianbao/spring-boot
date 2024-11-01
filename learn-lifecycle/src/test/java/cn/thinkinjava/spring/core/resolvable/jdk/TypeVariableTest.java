package cn.thinkinjava.spring.core.resolvable.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 类
 * @author qiuxianbao
 * @date 2024/11/01
 * @since ace_1.4.2_20240611
 */
public class TypeVariableTest<E> {
	public <T> void test(T t) {
	}

	@Test
	public void getGenericDeclarationTest() {
		// 1. 类上声明泛型
		TypeVariable<Class<TypeVariableTest>> classType = TypeVariableTest.class.getTypeParameters()[0];
		// E
		System.out.println(classType);

		Class<TypeVariableTest> clazzDeclaration = classType.getGenericDeclaration();
		// class cn.thinkinjava.spring.core.resolvable.jdk.TypeVariableTes
		System.out.println(clazzDeclaration);

		// 2. 方法上声明泛型
		Method[] methods = TypeVariableTest.class.getMethods();
		Method method = Arrays.stream(methods)
				.filter(m -> m.getName().equals("test"))
				.collect(Collectors.toList())
				.get(0);
		TypeVariable methodType = (TypeVariable) method.getGenericParameterTypes()[0];
		GenericDeclaration methodDeclaration = methodType.getGenericDeclaration();
		// public void cn.thinkinjava.spring.core.resolvable.jdk.TypeVariableTest.test(java.lang.Object)
		System.out.println(methodDeclaration);

		// 3. 构造器上声明泛型
	}


	/**
	 * 获取类或接口的泛型参数
	 * @see Class#getTypeParameters()
	 *
	 * 获取泛型变量的上边界
	 * @see TypeVariable#getBounds()
	 */
	@Test
	public void testGetBounds() {
		TypeVariable<Class<TypeVariable>>[] typeParameters = TypeVariable.class.getTypeParameters();

		// 获取类上声明的泛型变量
		// [D]
		System.out.println(Arrays.toString(typeParameters));
		TypeVariable<Class<TypeVariable>> typeParameter = typeParameters[0];
		// D
		System.out.println(typeParameter);

		// 获取泛型变量的上边界即extends，如果没有则返回 Object
		// [interface java.lang.reflect.GenericDeclaration]
		Type[] bounds = typeParameter.getBounds();
		System.out.println(Arrays.toString(bounds));
	}

	@Test
	public void testNoBounds() {
		TypeVariable<Class<TypeVariableNoBounds>>[] typeParameters = (TypeVariable<Class<TypeVariableNoBounds>>[]) TypeVariableNoBounds.class.getTypeParameters();

		// 获取类上声明的泛型变量
		// [T]
		System.out.println(Arrays.toString(typeParameters));
		TypeVariable<Class<TypeVariableNoBounds>> typeParameter = typeParameters[0];
		// T
		System.out.println(typeParameter);

		// 获取泛型变量的上边界即extends，如果没有则返回 Object
		// [class java.lang.Object]
		Type[] bounds = typeParameter.getBounds();
		System.out.println(Arrays.toString(bounds));
	}

	class TypeVariableNoBounds<T> {
	}
}
