package cn.thinkinjava.spring.lifecycle.runner;//package cn.thinkinjava.spring.init;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class CommandLineAppStartupRunner implements CommandLineRunner {
//    private static final Logger LOG =
//            LoggerFactory.getLogger(CommandLineAppStartupRunner.class);
//
//    public static int counter;
//
//    @Override
//    public void run(String...args) throws Exception {
//        //上下文已初始化完成
//        LOG.info("Increment counter");
//        counter++;
//    }
//}
//
