package com.adityatalpade;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by sunilnt on 06/10/17.
 */
@Aspect
public class LoggingAspect {
    @Before("execution(public void draw(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(String.format("Before %s executes", joinPoint.getSignature().toLongString()));
    }

    @After("execution(public void draw(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println(String.format("After %s executes", joinPoint.getSignature().toLongString()));
    }

    @Around("execution(public void draw(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(String.format("Before Around %s executes", joinPoint.getSignature().toLongString()));
        long before = System.currentTimeMillis();
        joinPoint.proceed();
        long after = System.currentTimeMillis();
        System.out.println(String.format("After Around %s executes", joinPoint.getSignature().toLongString()));
        System.out.println(String.format("It took %s ms to draw %s", after - before, joinPoint.getSignature().toLongString()));
    }
}
