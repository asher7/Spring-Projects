// MyAspect.java
package com.employee.microservice.Controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.employee.microservice.Service.PaymentServiceImpl.*(..))")
    public void printBefore() {
        System.err.println("payment started...");
    }

    @After("execution(* com.employee.microservice.Service.PaymentServiceImpl.*(..))")
    public void printAfter() {
        System.err.println("payment Ended");
    }
}
