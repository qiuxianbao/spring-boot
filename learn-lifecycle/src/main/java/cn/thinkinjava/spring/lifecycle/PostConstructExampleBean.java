package cn.thinkinjava.spring.lifecycle;//package cn.thinkinjava.spring.init;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.Arrays;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class PostConstructExampleBean {
//
//    private static final Logger LOG
//            = Logger.getLogger(PostConstructExampleBean.class);
//
//    @Autowired
//    private Environment environment;
//
//    @PostConstruct
//    public void init() {
//        //environment 已经注入
//        LOG.info(Arrays.asList(environment.getDefaultProfiles()));
//    }
//}
