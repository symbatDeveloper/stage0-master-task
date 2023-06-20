package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cathetusLength; i++) {
            sb.append(" ".repeat(Math.max(0, cathetusLength - 1 - i)));
            sb.append("*".repeat(i + 1));
            sb.append("\n");
        }
        System.out.print(sb);
    }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
