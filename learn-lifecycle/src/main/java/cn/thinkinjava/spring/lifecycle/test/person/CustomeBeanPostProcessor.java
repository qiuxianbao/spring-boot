// package cn.thinkinjava.spring.lifecycle.test.person;
//
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.BeansException;
// import org.springframework.beans.factory.config.BeanPostProcessor;
// import org.springframework.stereotype.Component;
//
// /**
//  * 自定义Bean的后缀处理器
//  *
//  * @author qiuxianbao
//  * @date 2024/06/27
//  * @since ace_1.4.2_20240611
//  */
// @Component
// public class CustomeBeanPostProcessor implements BeanPostProcessor {
//
//     private static Logger logger = LoggerFactory.getLogger(CustomeBeanPostProcessor.class);
//
//     @Override
//     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//         logger.warn("postProcessAfterInitialization");
//         return bean;
//     }
// }
