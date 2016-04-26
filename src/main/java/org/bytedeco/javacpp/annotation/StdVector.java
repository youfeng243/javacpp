package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * A shorthand for {@code @Adapter("VectorAdapter<type>")}.
 *
 * @author Samuel Audet
 * @see Adapter
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Adapter("VectorAdapter")
public @interface StdVector {
    /**
     * The template type of {@code VectorAdapter}. If not specified, it is
     * inferred from the value type of the {@link Pointer} or Java array.
     */
    String value() default "";
}