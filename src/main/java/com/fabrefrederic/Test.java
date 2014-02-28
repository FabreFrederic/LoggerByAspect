package com.fabrefrederic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fabrefrederic.service.MyService;

public class Test {

    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:com/fabrefrederic/spring/applicationContext.xml");
        final MyService service = (MyService) context.getBean("myService");
        service.displayDate();
        service.logParam("Hello from Mars");
    }
}
