package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates that a method maps to a virtual function in C++.
 * This allows a user to override that function in Java.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Virtual {
    /**
     * Pure (abstract) or not.
     */
    boolean value() default false;
}