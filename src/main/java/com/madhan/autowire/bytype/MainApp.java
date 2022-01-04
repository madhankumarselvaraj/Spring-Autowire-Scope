package com.madhan.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 * This example for type matching. Bean type when match automatically inject
 */
public class MainApp {

public static void main(String[] args) {
    ApplicationContext apCnxt = new ClassPathXmlApplicationContext("BeansType.xml");
    Employee emp = (Employee) apCnxt.getBean("employee");
    System.out.println(""+emp.getAddress().getFulladdress());
    System.out.println(""+emp.getAddress().getName());
}
}
