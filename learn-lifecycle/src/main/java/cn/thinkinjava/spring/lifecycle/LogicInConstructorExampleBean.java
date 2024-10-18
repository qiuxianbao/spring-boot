package cn.thinkinjava.spring.lifecycle;//package cn.thinkinjava.spring.init;
//
//import org.springframework.beans.factory.annotation.Autowired;
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
//public class LogicInConstructorExampleBean {
//
//    private static final Logger LOG
//            = Logger.getLogger(LogicInConstructorExampleBean.class);
//
//    private final Environment environment;
//
//    @Autowired
//    public LogicInConstructorExampleBean(Environment environment) {
//        //environment实例已初始化
//        this.environment = environment;
//        LOG.info(Arrays.asList(environment.getDefaultProfiles()));
//    }
//}
//
