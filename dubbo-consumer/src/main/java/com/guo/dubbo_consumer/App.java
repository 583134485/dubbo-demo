package com.guo.dubbo_consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guo.dubbo_api.DemoService;

import javassist.ClassPath;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        DemoService demoService=(DemoService) context.getBean("demoService");
        String hellofromservice=demoService.sayHello("gou");
        System.out.println("reply"+hellofromservice);
    }
}
