package com.adityatalpade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Shape shape1 = applicationContext.getBean("triangle", Shape.class);
        Shape shape2 = applicationContext.getBean("triangle", Shape.class);
        System.out.println("shape1 = " + shape1.hashCode());
        System.out.println("shape2 = " + shape2.hashCode());
    }
}
