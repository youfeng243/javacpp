package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * An annotation indicating that a method should behave like an array allocator.
 * However, methods with signature {@code native void allocateArray(int)} are
 * recognized as array allocators even without annotation. This behavior can be
 * changed by annotating the method with the {@link Function} annotation.
 * <p>
 * In a nutshell, an array allocator uses the C++ {@code new[]} operator, and
 * initializes the {@link Pointer#address} as well as the {@link Pointer#deallocator}
 * with {@code NativeDeallocator}, based on the {@code delete[]} operator, if
 * not additionally annotated with {@link NoDeallocator}.
 *
 * @author Samuel Audet
 * @see Pointer#init(long, long, long, long)
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ArrayAllocator {
}
