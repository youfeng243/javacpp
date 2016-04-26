package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates that an argument gets passed or returned by a reference to a pointer.
 * In C++, such a beast looks like {@code *&}, usually to output pointers via parameters.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface ByPtrRef {
}