package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        //Using by name
//        Dev obj=(Dev) context.getBean("dev");
        //Using By class
        Dev obj=context.getBean(Dev.class);
        System.out.println("Your name is "+ obj.getName()+ " Your age is:"+ obj.getAge());
        obj.build();
    }
}
