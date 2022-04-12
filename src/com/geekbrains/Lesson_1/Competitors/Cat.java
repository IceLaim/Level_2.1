package com.geekbrains.Lesson_1.Competitors;

public class Cat implements Competitor {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 45;
    }

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public int swim() {
        return 0;
    }

    @Override
    public String toString() {
        return "" + name + "";
    }
}
