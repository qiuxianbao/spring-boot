package cn.thinkinjava.spring.lifecycle.listener;//package cn.thinkinjava.spring.init;
//
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class EventListenerExampleBean {
//
//    private static final Logger LOG
//            = Logger.getLogger(EventListenerExampleBean.class);
//
//    public static int counter;
//
//    /**
//     * 添加 @EventListener 注解
//     * @param event
//     */
//    @EventListener
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        LOG.info("Increment counter");
//        counter++;
//    }
//}
//
