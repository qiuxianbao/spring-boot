package cn.thinkinjava.spring.core.resolvable;

import java.util.List;
import java.util.Map;

/**
 * @author qiuxianbao
 * @date 2024/10/29
 * @since ace_1.4.2_20240611
 */
public class ServiceImpl<A, B> implements Service<String, Integer>{
	public ServiceImpl(List<List<String>> list, Map<Double, Map<Float, Integer>> map) {
	}

	private Map<Float, Map<Double, Integer>> method() {
		return null;
	}
}
