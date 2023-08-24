package me.whiteship.demospring51.aop;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) //
public @interface PerfLogging {
}
