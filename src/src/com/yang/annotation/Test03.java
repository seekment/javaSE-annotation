package com.yang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Test03
 * @Author yang
 * @Description //TODO
 * @Date 22/07/11 23:02
 * @Version v1.0
 **/

// my annotation
public class Test03 {
    public static void main(String[] args) {
        System.out.println();
    }
    @MyAnnataion(name = "ylyang",age = 7)
    void test(){}


    @MyAnnataion2("ylyang")
    void test2(){}
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ interface  MyAnnataion{
    // parameter
    String name() default "";
    int age() default 0;
    int id() default -1; // not find

    String[] schools() default {"swy","PEU"};
}


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ interface  MyAnnataion2{
    // just one parameter
    String value();
}