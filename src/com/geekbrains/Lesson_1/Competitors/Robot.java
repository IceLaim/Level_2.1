package com.geekbrains.Lesson_1.Competitors;

public class Robot implements Competitor {

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 2000;
    }

    @Override
    public int jump() {
        return 35;
    }

    @Override
    public int swim() {
        return 250;
    }

    @Override
    public String toString() {
        return "" + name + "";
    }
}
