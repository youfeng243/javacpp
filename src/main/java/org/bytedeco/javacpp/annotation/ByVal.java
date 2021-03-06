package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates that an argument gets passed or returned by value. When used
 * alongside {@link FunctionPointer}, the {@link Generator} passes the underlying
 * C++ function object (aka functor) instead of a function pointer.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface ByVal {
    /**
     * A C++ expression to use when null is passed. By default {@link NullPointerException} is thrown.
     */
    String nullValue() default "";
}
