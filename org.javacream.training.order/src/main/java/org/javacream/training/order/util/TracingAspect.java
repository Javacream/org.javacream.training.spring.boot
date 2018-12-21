package org.javacream.training.order.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class TracingAspect {

    @Around("execution(* org.javacream..*.*(..))")
    public Object trace(ProceedingJoinPoint pjp) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getMethod().getName();
        System.out.println("**************** entering " + methodName);
        try {
            Object result = pjp.proceed();
            System.out.println("**************** returning from " + methodName + ", result=" + result);
            return result;
        }
        catch(Throwable t){
            System.out.println("**************** throwing from " + methodName + ", throwable=" + t);
            throw t;
        }
    }
}
