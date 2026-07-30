package life;


import org.springframework.beans.factory.config.BeanPostProcessor;

public class Logbean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("postProcessBeforeInitialization");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }
    //    第一步：使用无参构造
//    第二步：赋值
//    Aware:setBeanName
//    Aware:setBeanFactory
//            调用初始化方法postProcessBeforeInitialization
//    InitializingBean`s:afterPropertiesSet
//    第三步：初始化
//            调用初始化方法postProcessAfterInitialization
//    第四部dlife.Lifecycle@554e218
//    lifecycle-id: = 1
//    DisposableBean`s:destroy
//    第五步：摧毁bean
}
