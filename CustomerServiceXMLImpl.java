package com.sample.beanlifecycle;


public class CustomerServiceXMLImpl {

    public CustomerServiceXMLImpl() {
        System.out.println("In Constructor");
    }

    public void init() {
        System.out.println("Inside Init");
    }

    public void destroy() {
        System.out.println("Destroy Method");
    }

}
