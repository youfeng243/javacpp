package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * Indicates that an argument gets passed or returned by a pointer to a pointer.
 * This is usually used as a shortcut for the more versatile {@link PointerPointer}
 * peer class, but where the latter is not needed because the argument is not an array.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface ByPtrPtr {
}