package springboot.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Aspect
@org.springframework.stereotype.Service
public class Service {
    //切入点表达式
    //    execution(修饰符? 返回值 包名.类名.方法名(参数) throws异常?)
    @Pointcut("execution(* springboot.springaop.DaoImpl.*(..))")
    public void pointcut() {
    }
    @After("pointcut()")
    public void before() {
        System.out.println("执行成功");
    }
}
