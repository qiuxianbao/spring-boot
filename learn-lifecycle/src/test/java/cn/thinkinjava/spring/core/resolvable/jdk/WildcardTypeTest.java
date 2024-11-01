package cn.thinkinjava.spring.core.resolvable.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通配符，有上界和下届
 * ？extends 和 ? super
 *
 * @author qiuxianbao
 * @date 2024/11/01
 * @since ace_1.4.2_20240611
 */
public class WildcardTypeTest<T, A> {

	// 指定上界 Number，下边界默认为 []
	private List<? extends Number> a;

	// 指定下界 String，上边界默认是 Object
	private List<? super String> b;

	// 上界和下界都不指定，上边界默认是 Object，下边界默认为 []
	private Class<?> clazz;

	// 没有通配符，不是 WildcardType
	private List<String> c;

	// 没有通配符，不是 WildcardType
	String string;

	// 没有通配符，不是 WildcardType
	List<Set> a1;

	// 没有通配符，不是 WildcardType
	List<Set<String>> a2;

	// 没有通配符，不是 WildcardType
	List<T> a3;

	// 指定下界 []，上边界是 Set
	List<? extends Set> a4;

	// 没有通配符，不是 WildcardType
	List<Set<String>[]> a5;

	// GenericArrayType 类型
	private List<String>[] array;

	/**
	 * 总结：
	 * 1.需要先获取到泛型类型（可以区分出是数组 GenericArrayType 还是泛型参数 ParameterizedType）
	 * 2.如果是泛型参数，去掉<>可以再次区分出是通配符 WildcardType（上下界），还是 类型变量 TypeVariable
	 * @throws Exception
	 */
	@Test
	public void testWildcardType() throws Exception {
		Field[] fields = getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String nameString = field.getName();
			Type type = field.getGenericType();
			System.out.println("-------------" + nameString + " = " + type + "--------------");

			//1. 先拿到范型类型
			if (!(type instanceof ParameterizedType)) {
				System.out.println("GenericArrayType=" + (type instanceof GenericArrayType));
				continue;
			}

			// 获得<>中实际类型
			//2. 再从泛型里拿到通配符类型
			ParameterizedType parameterizedType = (ParameterizedType) type;
			type = parameterizedType.getActualTypeArguments()[0];
			if (!(type instanceof WildcardType)) {
				continue;
			}

			// 通配符 ?
			WildcardType wildcardType = (WildcardType) type;
			System.out.println("wildcardType=" + wildcardType);
			Type[] lowerTypes = wildcardType.getLowerBounds();
			if (lowerTypes != null) {
				System.out.println("下边界：" + Arrays.toString(lowerTypes));
			}
			Type[] upTypes = wildcardType.getUpperBounds();
			if (upTypes != null) {
				System.out.println("上边界：" + Arrays.toString(upTypes));
			}
		}
	}

}
