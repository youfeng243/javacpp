package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * This annotation must be used for native types that get declared but not defined.
 * Such types do not work with the {@code sizeof()} operator and their pointers
 * do not support arithmetic, so for peer classes thus annotated, {@link Generator}
 * then also ignores the {@link Pointer#position} value.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Opaque {
}
