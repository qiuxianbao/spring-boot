package cn.thinkinjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.env.EnvironmentPostProcessorsFactory;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.util.Instantiator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Lambda测试
 *
 * @author qiuxianbao
 * @date 2024/11/08
 * @since ace_1.4.2_20240611
 */
public class LambdaTest {


	@Test
	public void testConsumer() {
		// 有入参，没有返参
		Consumer<Instantiator.AvailableParameters> consumer1 = parameters -> {};
		//
		Consumer<Instantiator.AvailableParameters> consumer2 = new Consumer<Instantiator.AvailableParameters>() {
			@Override
			public void accept(Instantiator.AvailableParameters availableParameters) {
			}
		};

		//
		Consumer<Integer> consumer3 =  i -> {
			System.out.println(i * 2);
		};
		// 4
		consumer3.accept(2);


		// Spring
		Consumer<Instantiator.AvailableParameters> consumer = parameters -> {
			parameters.add(DeferredLogFactory.class, null);
		};

		Map<Class<?>, Function<Class<?>, Object>> result = new LinkedHashMap<>();
		consumer.accept(new Instantiator.AvailableParameters() {
			@Override
			public void add(Class<?> type, Object instance) {
				result.put(type, (factoryType) -> instance);
			}

			@Override
			public void add(Class<?> type, Function<Class<?>, Object> factory) {
				result.put(type, factory);
			}
		});
		// {interface org.springframework.boot.logging.DeferredLogFactory=null}
		System.out.println(result);

	}

	@Test
	public void testFunction() {
		// 入参是T，返回参数是R
		Function<ClassLoader, EnvironmentPostProcessorsFactory> function1 =  (classLoader) -> null;
		//
		Function<ClassLoader, EnvironmentPostProcessorsFactory> function2 =  new Function<ClassLoader, EnvironmentPostProcessorsFactory>() {
			@Override
			public EnvironmentPostProcessorsFactory apply(ClassLoader classLoader) {
				return null;
			}
		};

		//
		Function<List, Integer> listFunction = List::size;
		Integer size = listFunction.apply(new ArrayList<>());

		// Spring
		Function<ClassLoader, EnvironmentPostProcessorsFactory> function = EnvironmentPostProcessorsFactory::fromSpringFactories;
		EnvironmentPostProcessorsFactory factory = function.apply(null);
		// org.springframework.boot.env.ReflectionEnvironmentPostProcessorsFactory@604c5de8
		System.out.println(factory);
	}
}
