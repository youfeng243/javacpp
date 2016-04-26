package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Overrides the detection of allocators, getters, and setters. Indicates to the
 * {@link Generator} that we wish the method to call the corresponding C++ function.
 *
 * @author Samuel Audet
 * @see Allocator
 * @see ArrayAllocator
 * @see MemberGetter
 * @see MemberSetter
 * @see ValueSetter
 * @see ValueGetter
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Function {
}