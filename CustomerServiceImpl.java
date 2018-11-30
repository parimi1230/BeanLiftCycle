package com.sample.beanlifecycle;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerServiceImpl implements InitializingBean, DisposableBean{

    public CustomerServiceImpl(){
        System.out.println("In Constructor");
    }


    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("Before My Bean initialized");
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("Before My Bean Destroyed");
    }


}
