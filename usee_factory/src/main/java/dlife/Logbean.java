package dlife;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class Logbean implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("postProcessBeforeInitialization调用初始化方法");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("调用初始化方法postProcessAfterInitialization");
        return bean;
    }
}
