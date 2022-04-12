package com.geekbrains.Lesson_1.Competitors;

public class Human implements Competitor {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 150;
    }

    @Override
    public int jump() {
        return 4;
    }

    @Override
    public int swim() {
        return 60;
    }

    @Override
    public String toString() {
        return ""+ name + "";
    }
}

