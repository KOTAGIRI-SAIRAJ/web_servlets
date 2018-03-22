package com.training.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionRef {
    public static void main(String []args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("web.xml");
        Mobile exampleBean = (Mobile)ctx.getBean("exampleBean");
        exampleBean.callIphone();
    }
}
