package com.training.beanLifeCycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean , BeanNameAware{

    private String firstName;
    private String lastName;

    public Person() {System.out.println("def cons");}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName) {  this.firstName = firstName;}

    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void show(){
        System.out.println(firstName+" "+lastName);
        System.out.println("--------------------------------");
    }

    public void init(){
        System.out.println("Person init method called");
    }

    public void destroy(){
        System.out.println("Person destroy method called");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Person Init method after properties are set: "+firstName+" "+lastName);
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean Name:'"+beanName +"' bean has been initialized." );
    }

}
