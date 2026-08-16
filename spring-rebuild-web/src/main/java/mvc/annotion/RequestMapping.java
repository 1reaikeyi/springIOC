package mvc.annotion;

import mvc.method.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: 【15】RequestMapping
 * Description: 请求映射的注解
 */
@Target({ElementType.TYPE, ElementType.METHOD}) // 表示该注解能标注类，也能标注方法
@Retention(RetentionPolicy.RUNTIME) // 表示该注解可以被反射机制读取
public @interface RequestMapping {

    /**
     * 支持多个请求路径
     * @return
     */
    String[] value();

    /**
     * 指定请求方式
     * @return
     */
    RequestMethod method();

}

