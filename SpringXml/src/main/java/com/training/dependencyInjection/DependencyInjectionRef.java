package com.training.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionRef {
    public static void main(String []args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("web.xml");
        Mobile exampleBean = (Mobile)applicationContext.getBean("mobileBean");
        exampleBean.callIphone();
    }
}
