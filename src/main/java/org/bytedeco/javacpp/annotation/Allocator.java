package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * An annotation indicating that a method should behave like an allocator.
 * However, methods with signature {@code native void allocate(...)} are recognized
 * as allocators even without annotation. This behavior can be changed by annotating
 * the method with the {@link Function} annotation. An allocator must have no
 * return values, but can have parameters corresponding to the ones found on the
 * native C++ constructors.
 * <p>
 * In a nutshell, an allocator uses the C++ {@code new} operator along with all
 * the given arguments, and initializes the {@link Pointer#address} as well as
 * the {@link Pointer#deallocator} with {@code NativeDeallocator}, based on the
 * {@code delete} operator, if not additionally annotated with {@link NoDeallocator}.
 *
 * @author Samuel Audet
 * @see Pointer#init(long, long, long, long)
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Allocator {
}
