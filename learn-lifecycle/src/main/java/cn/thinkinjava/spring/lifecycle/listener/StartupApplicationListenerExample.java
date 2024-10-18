package cn.thinkinjava.spring.lifecycle.listener;//package cn.thinkinjava.spring.init;
//
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class StartupApplicationListenerExample implements
//        ApplicationListener<ContextRefreshedEvent> {
//
//    private static final Logger LOG
//            = Logger.getLogger(StartupApplicationListenerExample.class);
//
//    public static int counter;
//
//    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
//        LOG.info("Increment counter");
//        counter++;
//    }
//}
//
