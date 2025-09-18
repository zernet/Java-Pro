package com.gmail.zernetcsgo.hw21;

import java.util.Arrays;

public class ArrayUtils {

    @MethodInfo(
            name = "mergeSort",
            returnType = "void",
            description = "Сортування злиттям масиву int[] за зростанням (in-place)."
    )
    @Author(firstName = "Your", lastName = "Name")
    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) return;
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) >>> 1;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }

    private static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) a[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    @MethodInfo(
            name = "binarySearch",
            returnType = "int",
            description = "Бінарний пошук у відсортованому масиві int[]. Повертає індекс або -1."
    )
    @Author(firstName = "Your", lastName = "Name")
    public static int binarySearch(int[] array, int target) {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >>> 1);
            if (array[m] == target) return m;
            if (array[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    public static boolean isSortedAsc(int[] a) {
        for (int i = 1; i < a.length; i++) if (a[i] < a[i - 1]) return false;
        return true;
    }
}

