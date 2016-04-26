package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * An annotation indicating that a method should behave like a member getter.
 * However, a pair of methods with the same name, where the return value type of
 * the one short by a parameter equals the type of the extra parameter of the other,
 * whose return value type is {@code void} or of the enclosing class, are recognized
 * as a member getter/setter pair even without annotation. This behavior can be
 * changed by annotating the methods with the {@link Function} annotation.
 * <p>
 * A member getter either needs to return a value or accept a primitive array
 * as argument. The value returned is assumed to come from a member variable,
 * but anything that follows the same syntax as member variable access could
 * potential work with this annotation. For getters with a return value, all
 * arguments are considered as indices to access a member array.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MemberGetter {
}