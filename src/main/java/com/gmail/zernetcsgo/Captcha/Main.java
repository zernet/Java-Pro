package com.gmail.zernetcsgo.Captcha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number sequence: ");
        String input = scanner.nextLine();

        AsciiRenderer renderer = new AsciiRenderer();
        renderer.printAsciiNumber(input);
    }
}

