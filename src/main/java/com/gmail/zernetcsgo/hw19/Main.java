package com.gmail.zernetcsgo.hw19;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // числа від 0 до 99
        }

        System.out.println("Оригінальний масив: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        int target = array[5]; // шукаємо 6-й елемент для демонстрації
        int index = ArrayUtils.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено на позиції (індекс): " + index);
        } else {
            System.out.println("Елемент " + target + " не знайдено.");
        }
    }
}

