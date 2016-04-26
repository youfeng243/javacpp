package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * By default, {@link Generator} assumes all native functions may throw exceptions.
 * This way, any C++ exception thrown from a function gets caught and translated
 * into a {@link RuntimeException}. However, this adds some overhead and requires
 * additional support from the compiler. Annotating a class or a method with this
 * annotation indicates that none of the enclosed functions can throw exceptions,
 * and need not be included in a {@code try{ ... }} block.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NoException {
}
