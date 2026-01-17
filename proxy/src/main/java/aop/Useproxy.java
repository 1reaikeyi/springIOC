package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Useproxy {
    //切入点表达式
    //    execution(修饰符? 返回值 包名.类名.方法名(参数) throws异常?)
    @Pointcut("execution(* aop.Usee.*(..))")
    public void pointcut() {
    }
    //环绕通知
//    @Around("execution(* eAop.Usee.save(..))")
    @Around("pointcut()")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println("Around即将执行");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("Around执行完毕");
        Signature singnature = (Signature) pjp.getSignature();
        System.out.println("获取方法名： = " + singnature.getName());

    }

    //前置通知
//    @Before("execution(* eAop.Usee.save(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("Before通知保存即将执行");
    }
    //后置通知
//    @After("execution(* eAop.Usee.save(..))")
    @After("pointcut()")
    public void after1() {
        System.out.println("After通知保存即将执行");
    }
    //后置返回通知通知
//    @AfterReturning("execution(* eAop.Usee.save(..))")
    @AfterReturning("pointcut()")
    public void after(){
        System.out.println("AfterReturning通知保存执行完毕");
    }

    //异常通知
//    @AfterThrowing("execution(* eAop.Usee.save(..))")
    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("AfterThrowing通知保存异常");
    }
}
/**
 ┌─────────────────────────────────────┐
 │         @Around通知开始              │
 ├─────────────────────────────────────┤
 │         @Before通知                 │
 ├─────────────────────────────────────┤
 │         目标方法执行                 │
 ├─────────────────────────────────────┤
 │      @AfterReturning通知            │
 ├─────────────────────────────────────┤
 │         @After通知                  │
 ├─────────────────────────────────────┤
 │         @Around通知结束              │
 └─────────────────────────────────────┘
 */
