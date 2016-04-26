package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates a type cast required on the argument to satisfy the native compiler.
 * When used with {@link Adapter} a second cast can also be specified making it
 * possible to apply a cast to both the argument and the adapter, in this order.
 * <p>
 * At the moment, {@link Generator} makes use of the simple C-style cast. If one
 * requires a different kind of type conversion, such as the {@code dynamic_cast}
 * operator, those can be accessed as if they were functions (with the {@link Name}
 * annotation to specify the type) because they have the same syntax.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface Cast {
    String[] value();
}