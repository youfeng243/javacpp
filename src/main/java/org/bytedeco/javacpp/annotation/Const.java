package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * A shortcut annotation to {@link Cast} that simply adds {@code const} to the parameter type.
 * Can also be declared on a {@link FunctionPointer} in the case of {@code const} functions.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
public @interface Const {
    /**
     * If {@code true}, applies {@code const} to the value and to the pointer, respectively.
     */
    boolean[] value() default {true, false};
}
