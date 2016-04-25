package org.bytedeco.javacpp.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.bytedeco.javacpp.tools.Generator;

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