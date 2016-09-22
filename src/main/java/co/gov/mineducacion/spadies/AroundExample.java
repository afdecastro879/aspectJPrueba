package co.gov.mineducacion.spadies;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by andre on 21/09/2016.
 */
@Aspect
public class AroundExample {

    @Pointcut("execution(* co.gov.mineducacion..*(..))")
    public void deposit(){};

    @Around("co.gov.mineducacion.spadies.AroundExample.deposit()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        Object retVal = pjp.proceed();
        System.out.println("Executing aspectj");
        // stop stopwatch
        return retVal;
    }

}
