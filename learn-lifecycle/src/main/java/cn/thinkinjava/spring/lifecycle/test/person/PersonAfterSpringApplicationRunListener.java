package cn.thinkinjava.spring.lifecycle.test.person;//package cn.thinkinjava.spring.init.test.person;
//
//import org.springframework.boot.ConfigurableBootstrapContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplicationRunListener;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.core.env.ConfigurableEnvironment;
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//public class PersonAfterSpringApplicationRunListener implements SpringApplicationRunListener {
//    private final SpringApplication application;
//    private final String[] args;
//
//    public PersonAfterSpringApplicationRunListener(SpringApplication application, String[] args) {
//        this.application = application;
//        this.args = args;
//    }
//
//    @Override
//    public void starting(ConfigurableBootstrapContext bootstrapContext) {
//        /*
//         * Person has not been registered
//         */
////        Person person = bootstrapContext.get(Person.class);
////        person.run("SpringApplicationRunListener:starting");
//    }
//
//    @Override
//    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
//        /*
//         * Person has not been registered
//         */
////        Person person = bootstrapContext.get(Person.class);
////        person.run("SpringApplicationRunListener:environmentPrepared");
//    }
//
//    @Override
//    public void contextPrepared(ConfigurableApplicationContext context) {
//        /*
//         * Person has not been registered
//         */
////        Person person = context.getBean(Person.class);
////        person.run("SpringApplicationRunListener:contextPrepared");
//    }
//
//    @Override
//    public void contextLoaded(ConfigurableApplicationContext context) {
//        /*
//         * Person has not been registered
//         */
////        Person person = context.getBean(Person.class);
////        person.run("SpringApplicationRunListener:contextLoaded");
//    }
//
//    @Override
//    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
//        Person person = context.getBean(Person.class);
//        person.run("SpringApplicationRunListener:started");
//    }
//
//    @Override
//    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
//        Person person = context.getBean(Person.class);
//        person.run("SpringApplicationRunListener:ready");
//    }
//
//    @Override
//    public void failed(ConfigurableApplicationContext context, Throwable exception) {
//        Person person = context.getBean(Person.class);
//        person.run("SpringApplicationRunListener:failed");
//    }
//}
