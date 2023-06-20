package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append("%d x %d = %d\n".formatted(i, numberTableToPrint, i*numberTableToPrint));
        }
        System.out.print(sb);
    }
}
