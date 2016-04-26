package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * By default, {@link Generator} applies {@code offsetof()} to all member variables.
 * For each value returned {@link Loader#putMemberOffset(String, String, int)}
 * gets called, allowing to query efficiently those values from Java at a later
 * point by calling {@link Loader#offsetof(Class, String)}. However, this is
 * only guaranteed to work on plain old data (POD) {@code struct}. To prevent
 * the C++ compiler from complaining in other cases, we can add this annotation
 * to the peer class declaration.
 *
 * @author Samuel Audet
 * @see Generator
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NoOffset {
}
