package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Allows using method arguments to call {@code operator[]} in some circumstances.
 * For example, a call like {@code (*this)[i].foo(str)} could be accomplished with
 * {@code @Index native void foo(int i, String str)}.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Index {
    /**
     * The number of indices spread over the parameters, for multidimensional access.
     */
    int value() default 1;
}
