package factory;

import org.springframework.beans.factory.FactoryBean;

public class AFactoryBean implements FactoryBean<A> {
    @Override
    public A getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
//        @Override
//        public boolean isSingleton() {
//            return false;
//        }
}
