package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("This animal is mostly ")
                .append(color)
                .append(". It has ")
                .append(numberOfPaws)
                .append(" paw");
        if (numberOfPaws != 1)
            sb.append("s");
        sb.append(" and ");
        if (hasFur)
            sb.append("a");
        else
            sb.append("no");
        sb.append(" fur.");
        return sb.toString();
    }

}
