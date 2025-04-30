package org.AGa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        ctx.getBean("eatingProcess", Process.class).run();

        ctx.getBean("walkingProcess", Process.class).run();
    }
}
