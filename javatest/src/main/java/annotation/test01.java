package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class test01{
    public void test()
    {

    }
}

//定义一个注解，target表示我们用在哪些地方
//Retention表示我们注解在什么地方有效 runtime>class>sources
// @Documented：说明该注解将被包含在javadoc文档中
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    //注解的参数：参数类型+参数名();
    String name() default "";
    int age() default 0;
    String[] schools();
}