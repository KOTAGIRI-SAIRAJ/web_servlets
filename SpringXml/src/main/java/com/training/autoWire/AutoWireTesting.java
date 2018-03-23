package com.training.autoWire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutoWireTesting {
    public static void main(String []args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("web.xml");

        Building buildingByName=(Building) context.getBean("building");
        System.out.println("-------- By Name --------");
        System.out.println("Builder Name: "+buildingByName.getBuilderName());
        System.out.println("Room Color: "+buildingByName.getRoom().getRoomColor());
        System.out.println("Room Type: "+buildingByName.getRoom().getRoomType());

        /*Building buildingByType=(Building) context.getBean("building");
        System.out.println("--- By Type ---");
        System.out.println("Builder Name: "+buildingByType.getBuilderName());
        System.out.println("Room Color: "+buildingByType.getRoom().getRoomColor());
        System.out.println("Room Type: "+buildingByType.getRoom().getRoomType());
        context.close();*/
    }
}
