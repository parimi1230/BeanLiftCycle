package com.sample.beanlifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerServiceImplAnnotation {

    public CustomerServiceImplAnnotation() {
        System.out.println("In Constructor");
    }

    @PostConstruct
    public void initMyMethod(){
        System.out.println("Before My Annotation");
    }

    @PreDestroy
    public void destroyMyMethod(){
        System.out.println("After My Annotation");
    }

}
