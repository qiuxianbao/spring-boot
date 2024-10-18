package cn.thinkinjava.spring.lifecycle.runner;//package cn.thinkinjava.spring.init;
//
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class AppStartupRunner implements ApplicationRunner {
//    private static final Logger LOG =
//            LoggerFactory.getLogger(AppStartupRunner.class);
//
//    public static int counter;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        LOG.info("Application started with option names : {}",
//                args.getOptionNames());
//        LOG.info("Increment counter");
//        counter++;
//    }
//}
//
