package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Lifecycle implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{
    private int id;

    public Lifecycle() {
        System.out.println("第一步：使用无参构造");
    }

    public Lifecycle(int id) {
        this.id = id;
        System.out.println("第一步：使用有参构造");
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("第二步：赋值");
    }

    public void ininBean(){
        System.out.println("第三步：初始化");
    }

    public void destroyBean(){
        System.out.println("第五步：摧毁bean");
    }

    public int getId() {
        return id;
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Aware:setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Aware:setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean:afterPropertiesSet");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean:destroy");
    }

//    第一步：使用无参构造
//    第二步：赋值
//    Aware:setBeanName
//    Aware:setBeanFactory
//
//    InitializingBean`s:afterPropertiesSet
//    第三步：初始化
//
//    第四部dlife.Lifecycle@554e218
//    lifecycle-id: = 1
//    DisposableBean`s:destroy
//    第五步：摧毁bean


}
