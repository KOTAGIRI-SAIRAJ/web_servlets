package com.training.inheritance.withExtends;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inheritance {
    public static void main(String []args){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("web.xml");
        MacBook macBook=(MacBook)applicationContext.getBean("macbook");
        System.out.println(macBook.getHardDiskCapacity());
        System.out.println(macBook.getRam());
        System.out.println(macBook.getOsType());
    }
}
