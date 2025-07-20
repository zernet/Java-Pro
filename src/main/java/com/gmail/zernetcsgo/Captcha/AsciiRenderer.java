package com.gmail.zernetcsgo.Captcha;

public class AsciiRenderer {

    public void printAsciiNumber(String input) {
        for (int row = 0; row < 7; row++) {
            for (char c : input.toCharArray()) {
                AsciiDigit digit = AsciiDigit.fromChar(c);
                if (digit != null) {
                    System.out.print(digit.getLines()[row] + "  ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}
