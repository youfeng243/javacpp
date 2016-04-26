package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * A shorthand for {@code @Cast("std::string&") @Adapter("StringAdapter")}.
 *
 * @author Samuel Audet
 * @see Adapter
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Cast("std::string&")
@Adapter("StringAdapter")
public @interface StdString {
}