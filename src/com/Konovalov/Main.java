package com.Konovalov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer container = new TextContainer();
        Class<?> aClass = container.getClass();
        Method[] methods = aClass.getMethods();
        for (Method element : methods) {
            if (element.isAnnotationPresent(Saver.class)) {
                if (aClass.isAnnotationPresent(SaveTo.class)) {
                    element.invoke(container, aClass.getAnnotation(SaveTo.class).patch());
                    break;
                }

            }
        }

    }
}
