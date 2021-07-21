package com.msg.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Simple example for reflection.
 *
 * @author ballat
 */
public class TestReflection {

    private static void process(String str) {
        System.out.println("processing " + str);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = TestReflection.class.getDeclaredMethod("process", String.class);
        Object rv = m.invoke(null, "test");
        System.out.println(rv);
    }
}
