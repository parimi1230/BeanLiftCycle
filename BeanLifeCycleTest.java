package com.sample.beanlifecycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {

    public static void main(final String[] args) {
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext-beanlifecycle.xml");
        //context.getBean("customerService");
        //context.getBean("customerServiceXMLImpl");
        context.getBean("customerServiceImplAnnotation");
        context.registerShutdownHook();

    }

}
