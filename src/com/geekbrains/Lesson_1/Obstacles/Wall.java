package com.geekbrains.Lesson_1.Obstacles;

import com.geekbrains.Lesson_1.Competitors.Competitor;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcomeObstacleBy(Competitor competitor) {
        if (competitor.jump() > height) {
            System.out.printf("Участник %s успешно преодолел стену высотой %d м %n", competitor, height);
            return true;
        }
        System.out.printf("Участник %s не смог преодолеть стену высотой %d м %n", competitor, height);
        return false;
    }
}
