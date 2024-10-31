package cn.thinkinjava.spring.core.resolvable.jdk;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * java Type
 * @author qiuxianbao
 * @date 2024/10/29
 * @since ace_1.4.2_20240611
 */
public class JDKTypeTest {

	@Test
	public void test() {

		// 判断是否继承自某个类或者实现某个接口
		// System.out.println(List.class.isAssignableFrom(ArrayList.class));    // true
		// System.out.println(String.class.isAssignableFrom(ArrayList.class));  // false

		// 调用这个方法的 class 对象转换成由 clazz 参数所表示的 class 对象的某个子类
		List<String> strList = new ArrayList<String>();
		// class java.util.ArrayList
		// Class<? extends List> strList_cast = strList.getClass().asSubclass(List.class);
		// System.out.println(strList_cast);

		// 用于检查对象实例类型
		// System.out.println(strList instanceof List);
		// System.out.println(strList instanceof Map);
	}

	class Animal {}
	class Dog extends Animal {}

}
