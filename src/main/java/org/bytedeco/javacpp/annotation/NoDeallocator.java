package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * By default, all allocators attach a deallocator to the peer object on creation.
 * This way, the deallocator automatically gets called during garbage collection.
 * Since an allocator uses the {@code new} (or for arrays the {@code new[]})
 * operator, the deallocator produced uses the {@code delete} (or {@code delete[]})
 * operator. However, if that operator is not accessible, or the native library
 * does not use that operator for object deallocation, we may apply this annotation
 * to an allocator method to prevent it from using these operators.
 *
 * @author Samuel Audet
 * @see Allocator
 * @see ArrayAllocator
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NoDeallocator {
}