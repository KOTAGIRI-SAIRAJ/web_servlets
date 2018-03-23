package com.training.beanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class BeanWireMain {
    public static void main(String[] args) {

        /*Using Application Context*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("web.xml");
        Person usingApplicationContext = (Person)applicationContext.getBean("applicationContext");
        usingApplicationContext.show();

        Person usingApplicationContextSingleTon = (Person)applicationContext.getBean("applicationContextSingleTonScope");
        usingApplicationContextSingleTon.show();

        Person usingApplicationContextPrototype = (Person)applicationContext.getBean("applicationContextPrototype");
        usingApplicationContextPrototype.show();

        ClassPathXmlApplicationContext classPathXmlApplicationContext= new ClassPathXmlApplicationContext("web.xml");
        Person usingClassPathXmlApplicationContext= (Person)applicationContext.getBean("contextPathXmlApplicationContext");
        usingClassPathXmlApplicationContext.show();
        classPathXmlApplicationContext.close();

        /*Request and Sessions are not Working for Application context*/
        /*Person usingApplicationContextRequest = (Person)applicationContext.getBean("applicationContextRequest");
        usingApplicationContextRequest.show();

        Person usingApplicationContextSession = (Person)applicationContext.getBean("applicationContextSession");
        usingApplicationContextSession.show();*/

        /*Using Bean Factory*/
        Resource resource = new ClassPathResource("web.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Person usingBeanFactory = (Person)factory.getBean("beanFactory");
        usingBeanFactory.show();

        Person usingBeanFactorySingleTon = (Person)factory.getBean("beanFactorySingleTonScope");
        usingBeanFactorySingleTon.show();

        Person usingBeanFactoryPrototype = (Person)factory.getBean("beanFactoryPrototype");
        usingBeanFactoryPrototype.show();

        Person usingBeanFactoryBeanLifeCycle = (Person)factory.getBean("beanLifeCycleMethods");
        usingBeanFactoryBeanLifeCycle.show();

        /*Request and Sessions are not Working for Bean Factory*/
        /*Person usingBeanFactorySession = (Person)factory.getBean("beanFactorySession");
        usingBeanFactorySession.show();

        Person usingBeanFactoryRequest = (Person)factory.getBean("beanFactoryRequest");
        usingBeanFactoryRequest.show();*/
    }
}


