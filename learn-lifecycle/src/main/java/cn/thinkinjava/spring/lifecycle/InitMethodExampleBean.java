package cn.thinkinjava.spring.lifecycle;//package cn.thinkinjava.spring.init;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Arrays;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//public class InitMethodExampleBean {
//
//    private static final Logger LOG = Logger.getLogger(InitMethodExampleBean.class);
//
//    @Autowired
//    private Environment environment;
//
//    public void init() {
//        LOG.info(Arrays.asList(environment.getDefaultProfiles()));
//    }
//}
