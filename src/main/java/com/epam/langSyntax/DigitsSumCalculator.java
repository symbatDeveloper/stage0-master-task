package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int result = 0;
        int currentD;

        while (number > 0)
        {
            currentD = number % 10;
            result += currentD;
            number = number / 10;
        }
         System.out.println(result);
    }

}
