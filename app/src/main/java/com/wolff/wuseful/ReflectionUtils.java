package com.wolff.wuseful;

import java.lang.reflect.ParameterizedType;

/**
 * Created by wolfff on 01.02.18.
 */

public class ReflectionUtils {
    public static Class getGenericParameterClass(Class actualClass, int parameterIndex) {
        return (Class) ((ParameterizedType) actualClass.getGenericSuperclass()).getActualTypeArguments()[parameterIndex];
    }
}
