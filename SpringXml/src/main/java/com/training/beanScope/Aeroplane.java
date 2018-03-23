package com.training.beanScope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aeroplane {
    public static void main(String []args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("web.xml");

        Engine sEngine = (Engine)applicationContext.getBean("engineBeanSingleTon") ;
        sEngine.setSerialNr(123456789);
        System.out.println("Engine Serial Number (Single Ton): " + sEngine.getSerialNr());

        sEngine = (Engine) applicationContext.getBean("engineBeanSingleTon");
        System.out.println("Engine Serial Number (Single Ton): " + sEngine.getSerialNr());

        Engine pEngine = (Engine)applicationContext.getBean("engineBeanPrototype") ;
        pEngine.setSerialNr(123456789);
        System.out.println("Engine Serial Number (Prototype): " + pEngine.getSerialNr());

        pEngine = (Engine) applicationContext.getBean("engineBeanPrototype");
        System.out.println("Engine Serial Number (Prototype): " + pEngine.getSerialNr());

    }
}
