package com.geekbrains.Lesson_1.Obstacles;

import com.geekbrains.Lesson_1.Competitors.Competitor;

public class River implements Obstacle {

    private final int width;

    public River(int width) {
        this.width = width;
    }

    @Override
    public boolean overcomeObstacleBy(Competitor competitor) {
        if (competitor.swim() > width) {
            System.out.printf("Участник %s успешно преодолел реку шириной %d метров %n", competitor, width);
            return true;
        }
        System.out.printf("Участник %s не смог преодолеть реку шириной %d м %n", competitor, width);
        return false;
    }
}
