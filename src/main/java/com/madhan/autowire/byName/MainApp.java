package com.madhan.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class MainApp {

public static void main(String[] args) {
    ApplicationContext apCnxt = new ClassPathXmlApplicationContext("BeansName.xml");
    Employee emp = (Employee) apCnxt.getBean("employee");
    System.out.println("" + emp.getAddress().getFulladdress());
    System.out.println("" + emp.getAddress().getName());
}
}
