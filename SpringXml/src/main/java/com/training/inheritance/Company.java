package com.training.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
    public static void main(String []args){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("web.xml");

        SoftwareCompany softwareCompany = (SoftwareCompany)applicationContext.getBean("softwareCompanyBean");
        softwareCompany.getCompanyName();
        softwareCompany.getTypeOfCompany();

        HardwareCompany hardwareCompany= (HardwareCompany)applicationContext.getBean("hardwareCompanyBean");
        hardwareCompany.getCompanyName();
        hardwareCompany.getTypeOfCompany();
        hardwareCompany.getTotalStaff();
    }
}
