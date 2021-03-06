package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * An annotation indicating that a method should behave like a member setter.
 * However, a pair of methods with the same name, where the return value type of
 * the one short by a parameter equals the type of the extra parameter of the other,
 * whose return value type is {@code void} or of the enclosing class, are recognized
 * as a member getter/setter pair even without annotation. This behavior can be
 * changed by annotating the methods with the {@link Function} annotation.
 * <p>
 * A member setter must return no value, or an object of its own {@link Class},
 * while its number of parameters must be greater than 0. The assigned value is
 * assumed to be a member variable, but anything that follows the same syntax as
 * the assignment of a member variable could potentially work with this annotation.
 * All but the last argument are considered as indices to access a member array.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MemberSetter {
}