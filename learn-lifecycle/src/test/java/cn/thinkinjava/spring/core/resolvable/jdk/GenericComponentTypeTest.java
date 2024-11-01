package cn.thinkinjava.spring.core.resolvable.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/**
 * @author qiuxianbao
 * @date 2024/11/01
 * @since ace_1.4.2_20240611
 */
public class GenericComponentTypeTest<K> {
	ClassA<K>[][] key;

	/**
	 *
	 * @see GenericArrayType#getGenericComponentType()
	 * @throws NoSuchFieldException
	 */
	@Test
	public void testGetGenericComponentType() throws NoSuchFieldException {
		// cn.thinkinjava.spring.core.resolvable.jdk.GenericComponentTypeTest<K>$ClassA<K>[][]
		Type type = getClass().getDeclaredField("key").getGenericType();
		System.out.println(type);

		// cn.thinkinjava.spring.core.resolvable.jdk.GenericComponentTypeTest<K>$ClassA<K>[]
		System.out.println(((GenericArrayType)type).getGenericComponentType());
	}

	class ClassA<T> {
	}
}
