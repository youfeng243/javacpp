package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.tools.Builder;
import org.bytedeco.javacpp.tools.Generator;
import org.bytedeco.javacpp.tools.Parser;

import java.lang.annotation.*;

/**
 * Makes it possible to define more than one set of properties for each platform.
 * The effective set of properties are taken from all {@link Platform} values in
 * this annotation, but priority is given to values found later in the list, making
 * it possible to define a default set of properties as the first value of the array,
 * and specializing a smaller set of properties for each platform, subsequently.
 * <p>
 * A class with this annotation gets recognized as top-level enclosing class by
 * {@link Loader#getEnclosingClass(Class)}, with the same implications as with
 * the {@link Platform} annotation.
 * <p>
 * Additionally, it is possible to inherit properties from another class also
 * annotated with this annotation, and specialize further for the current class.
 *
 * @author Samuel Audet
 * @see Builder
 * @see Generator
 * @see Loader
 * @see Parser
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Properties {
    /**
     * A list of classes from which to inherit properties.
     */
    Class[] inherit() default {};

    /**
     * A list of platform names to be used as default for {@link #value()}.
     */
    String[] names() default {};

    /**
     * A list of properties for different platforms.
     */
    Platform[] value() default {};

    /**
     * The target Java source code file of the {@link Parser}.
     */
    String target() default "";

    /**
     * An optional helper class the {@link Parser} should use as base of the target.
     * Defaults to the class where this annotation was found.
     */
    String helper() default "";
}
