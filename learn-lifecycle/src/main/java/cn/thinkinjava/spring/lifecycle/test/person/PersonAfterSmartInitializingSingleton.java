package cn.thinkinjava.spring.lifecycle.test.person;//package cn.thinkinjava.spring.init.test.person;
//
//import org.springframework.beans.factory.SmartInitializingSingleton;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @author qiuxianbao
// * @date 2024/10/08
// * @since ace_1.4.2_20240611
// */
//@Component
//public class PersonAfterSmartInitializingSingleton implements SmartInitializingSingleton {
//    @Autowired
//    private Person person;
//    @Override
//    public void afterSingletonsInstantiated() {
//        person.run("SmartInitializingSingleton");
//    }
//}
