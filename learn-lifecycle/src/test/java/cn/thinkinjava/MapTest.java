package cn.thinkinjava;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Map
 * @author qiuxianbao
 * @date 2024/10/28
 * @since ace_1.4.2_20240611
 */
public class MapTest {



	@Test
	public void tesComputeIfAbsent() {
		Map<String, List<String>> result = new HashMap<>();
		String factoryTypeName = "com.alibaba.dubbo.common.extension.ExtensionLoader";
		result.computeIfAbsent(factoryTypeName, key -> new ArrayList<>())
				.add("1");
		System.out.println(result);
	}

}
