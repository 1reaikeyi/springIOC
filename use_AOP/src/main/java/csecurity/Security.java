package csecurity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Security {
//    execution(修饰符? 返回值 包名.类名.方法名(参数) throws异常?)
    @Pointcut("execution(* csecurity.Serverr.*(..))")
    public void pointCut() {

    }
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("开启权限校验");
        try {
            joinPoint.proceed();
            System.out.println(joinPoint.getSignature().getName()+"\t"+joinPoint.getSignature().getDeclaringTypeName());
        } catch (Throwable e) {
            throw new RuntimeException(e);

        }
        System.out.println("权限校验结束");
        System.out.println();
    }
}
