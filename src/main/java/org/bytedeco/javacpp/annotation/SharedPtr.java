package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * A shorthand for {@code @Adapter("SharedPtrAdapter<type>")}.
 * We also need to define the {@code SHARED_PTR_NAMESPACE} macro
 * to something like {@code boost} or {@code std}.
 *
 * @author Samuel Audet
 * @see Adapter
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Adapter("SharedPtrAdapter")
public @interface SharedPtr {
    /**
     * The template type of {@code SharedPtrAdapter}. If not specified, it is
     * inferred from the value type of the {@link Pointer} or Java array.
     */
    String value() default "";
}