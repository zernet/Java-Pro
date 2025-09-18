package com.gmail.zernetcsgo.hw16;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.concurrent.ThreadLocalRandom;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface StringManipulator {
    String manipulate(String input);
}

class StringListProcessor {
    public static int countUppercase(String s) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be <= max");
        }
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static int generate1to100() {
        return generateRandomNumber(1, 100);
    }
}

public class Demo {
    public static void main(String[] args) {

        MathOperation add = Integer::sum;
        int sum = add.operate(10, 32);

        StringManipulator toUpper = String::toUpperCase;
        String original = "Lambda & Methods!";
        String upper = toUpper.manipulate(original);

        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String sample = "ПрИвІт Java ABC xyz ŽŹ";
        int uppercaseCount = uppercaseCounter.apply(sample);

        Supplier<Integer> random1to100 = RandomNumberGenerator::generate1to100;
        int randomValue = random1to100.get();

        System.out.println("=== Результати ===");
        System.out.println("Сума 10 + 32 = " + sum);
        System.out.println("Оригінал: " + original);
        System.out.println("Верхній регістр: " + upper);
        System.out.println("Рядок для підрахунку: " + sample);
        System.out.println("Кількість великих літер: " + uppercaseCount);
        System.out.println("Випадкове число [1..100]: " + randomValue);
    }
}
