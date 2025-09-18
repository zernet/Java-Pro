package com.gmail.zernetcsgo.hw21;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println("Оригінальний: " + Arrays.toString(arr));

        ArrayUtils.mergeSort(arr);
        System.out.println("Відсортований: " + Arrays.toString(arr));
        System.out.println("isSortedAsc: " + ArrayUtils.isSortedAsc(arr));

        int target = arr[5];
        int idx = ArrayUtils.binarySearch(arr, target);
        System.out.printf("binarySearch(%d) => %d%n", target, idx);

        System.out.println("\n=== Анотації методів ArrayUtils ===");
        for (Method m : ArrayUtils.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(MethodInfo.class) || m.isAnnotationPresent(Author.class)) {
                System.out.println("Метод: " + m.getName());

                MethodInfo mi = m.getAnnotation(MethodInfo.class);
                if (mi != null) {
                    System.out.println("  @MethodInfo:");
                    System.out.println("    name        = " + mi.name());
                    System.out.println("    returnType  = " + mi.returnType());
                    System.out.println("    description = " + mi.description());
                }

                Author au = m.getAnnotation(Author.class);
                if (au != null) {
                    System.out.println("  @Author:");
                    System.out.println("    firstName   = " + au.firstName());
                    System.out.println("    lastName    = " + au.lastName());
                }
            }
        }

        System.out.println("\nПеревірка:");
        System.out.println("  mergeSort анотований: " + hasAnnotations("mergeSort"));
        System.out.println("  binarySearch анотований: " + hasAnnotations("binarySearch"));
    }

    private static boolean hasAnnotations(String methodName) {
        try {
            Method m;
            if ("mergeSort".equals(methodName)) {
                m = ArrayUtils.class.getDeclaredMethod("mergeSort", int[].class);
            } else if ("binarySearch".equals(methodName)) {
                m = ArrayUtils.class.getDeclaredMethod("binarySearch", int[].class, int.class);
            } else {
                return false;
            }
            return m.isAnnotationPresent(MethodInfo.class) && m.isAnnotationPresent(Author.class);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
