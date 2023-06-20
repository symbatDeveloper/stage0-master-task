package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cathetusLength; i++) {
            sb.append(" ".repeat(Math.max(0, cathetusLength - 1 - i)));
            for (int k = i + 1; k >= 2; k--)
                sb.append(k);
            for (int f = 1; f <= i + 1; f++)
                sb.append(f);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
