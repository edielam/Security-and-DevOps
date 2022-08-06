package com.example.demo;

import java.lang.reflect.Field;

public class TestUtils {
    public static void injectObjects(Object target, String fieldName, Object toInject){
        boolean wasPrivate = false;

        try {
            Field kField = target.getClass().getDeclaredField(fieldName);

            if (!kField.isAccessible()){
                kField.setAccessible(true);
                wasPrivate = true;
            }
            kField.set(target, toInject);
            if (wasPrivate){
                kField.setAccessible(false);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
          catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
