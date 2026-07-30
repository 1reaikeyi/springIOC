package btransaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("useapo")
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Useapo {
    //    execution(修饰符? 返回值 包名.类名.方法名(参数) throws异常?)
    @Around("execution (* btransaction.Usee.*(..)) ")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("开启事务");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(String.format("事务回滚,异常信息为:%s",e.getMessage()));
        }
        System.out.println("提交事务");
    }
}
