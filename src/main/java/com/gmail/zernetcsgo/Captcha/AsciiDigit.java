package com.gmail.zernetcsgo.Captcha;

public enum AsciiDigit {
    ZERO('0', new String[]{
            " ### ",
            "#   #",
            "#  ##",
            "# # #",
            "##  #",
            "#   #",
            " ### "
    }),
    ONE('1', new String[]{
            "  #  ",
            " ##  ",
            "# #  ",
            "  #  ",
            "  #  ",
            "  #  ",
            "#####"
    }),
    TWO('2', new String[]{
            " ### ",
            "#   #",
            "    #",
            "   # ",
            "  #  ",
            " #   ",
            "#####"
    }),
    THREE('3', new String[]{
            " ### ",
            "#   #",
            "    #",
            " ### ",
            "    #",
            "#   #",
            " ### "
    }),
    FOUR('4', new String[]{
            "   # ",
            "  ## ",
            " # # ",
            "#  # ",
            "#####",
            "   # ",
            "   # "
    }),
    FIVE('5', new String[]{
            "#####",
            "#    ",
            "#    ",
            "#### ",
            "    #",
            "#   #",
            " ### "
    }),
    SIX('6', new String[]{
            " ### ",
            "#   #",
            "#    ",
            "#### ",
            "#   #",
            "#   #",
            " ### "
    }),
    SEVEN('7', new String[]{
            "#####",
            "    #",
            "   # ",
            "  #  ",
            "  #  ",
            "  #  ",
            "  #  "
    }),
    EIGHT('8', new String[]{
            " ### ",
            "#   #",
            "#   #",
            " ### ",
            "#   #",
            "#   #",
            " ### "
    }),
    NINE('9', new String[]{
            " ### ",
            "#   #",
            "#   #",
            " ####",
            "    #",
            "#   #",
            " ### "
    });

    private final char digit;
    private final String[] lines;

    AsciiDigit(char digit, String[] lines) {
        this.digit = digit;
        this.lines = lines;
    }

    public char getDigit() {
        return digit;
    }

    public String[] getLines() {
        return lines;
    }

    public static AsciiDigit fromChar(char c) {
        for (AsciiDigit d : values()) {
            if (d.getDigit() == c) return d;
        }
        return null;
    }
}
