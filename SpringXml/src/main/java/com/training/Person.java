package com.training;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean , BeanNameAware{

    private String name;

    public Person() {System.out.println("def cons");}

    public Person(String name) {  this.name = name;}

    void show(){
        System.out.println(name);
        System.out.println("--------------------------------");
    }

    public void init(){
        System.out.println("Person init method called");
    }

    public void destroy(){
        System.out.println("Person destroy method called");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Person Init method after properties are set: "+name);
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean Name:'"+beanName +"' bean has been initialized." );
    }

}
