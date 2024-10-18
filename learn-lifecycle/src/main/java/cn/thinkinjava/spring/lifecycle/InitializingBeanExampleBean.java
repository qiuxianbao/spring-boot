package cn.thinkinjava.spring.lifecycle;//package cn.thinkinjava.spring.lifecycle;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class InitializingBeanExampleBean implements InitializingBean {
//
//    private static final Logger LOG
//            = Logger.getLogger(InitializingBeanExampleBean.class);
//
//    @Autowired
//    private Environment environment;
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        //environment 已经注入
//        LOG.info(Arrays.asList(environment.getDefaultProfiles()));
//    }
//}
//
