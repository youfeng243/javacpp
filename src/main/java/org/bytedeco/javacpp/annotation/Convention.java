package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Specifies the calling convention of a {@link FunctionPointer}.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Convention {
    String value();

    String extern() default "C";
}