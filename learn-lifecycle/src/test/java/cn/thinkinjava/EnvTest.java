package cn.thinkinjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.config.ConfigDataLocation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuxianbao
 * @date 2024/12/11
 * @since acc_1.3.1_20241120
 */
public class EnvTest {

	@Test
	public void test() {
		List<ConfigDataLocation> locations = new ArrayList<>();
		// 项目resources
		locations.add(ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/"));
		// 项目根目录
		locations.add(ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/"));
		System.out.println(locations);

	}
}
