/**
 *
 */
package com.fabrefrederic;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 */
@Aspect
public class ClassLogger {
    private final Logger LOGGER = Logger.getLogger(getClass());

    @Before("execution(* com.fabrefrederic.service.*+.*(..))")
    public void logBefore(final JoinPoint point) {
        LOGGER.debug(point.getSignature().getName() + " - begin");

    }

    @After("execution(* com.fabrefrederic.service.*+.*(..))")
    public void logAfter(final JoinPoint point) {
        LOGGER.debug(point.getSignature().getName() + " - after");
    }
}
