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
 * This class logs the execution begin, the parameters and the execution end of every service methods
 */
@Aspect
public class ClassLogger {
    private Logger logger = Logger.getLogger("");

    @Before("execution(* com.fabrefrederic.service.*+.*(..))")
    public void logBefore(final JoinPoint point) {
        if (logger.isDebugEnabled()) {
            logger = Logger.getLogger(point.getThis().getClass());
            logger.debug(point.getSignature().getName() + "() - BEGIN");

            for (final Object object : point.getArgs()) {
                logger.debug("Parameter type : " + object.getClass().getName());
                logger.debug("Parameter value : " + object);
            }
        }
    }

    @After("execution(* com.fabrefrederic.service.*+.*(..))")
    public void logAfter(final JoinPoint point) {
        if (logger.isDebugEnabled()) {
            logger = Logger.getLogger(point.getThis().getClass());
            logger.debug(point.getSignature().getName() + "() - END");
        }
    }
}
