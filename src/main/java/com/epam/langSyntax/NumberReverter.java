package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            result = (result * 10) + remainder;
            number = number / 10;
        }
        System.out.println(result);
    }

}
