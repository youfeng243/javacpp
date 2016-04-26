package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates that an argument should get passed or returned by pointer. By default,
 * all {@link Pointer} and array arguments get passed by pointer. Since it is
 * not used for any other purposes at the moment, this annotation has no effect.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface ByPtr {
}