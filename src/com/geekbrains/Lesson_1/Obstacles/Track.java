package com.geekbrains.Lesson_1.Obstacles;

import com.geekbrains.Lesson_1.Competitors.Competitor;


public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcomeObstacleBy(Competitor competitor) {
        if (competitor.run() >= length) {
            System.out.printf("Участник %s успешно преодолел дорожку длиной %d метров %n", competitor, length);
            return true;
        }
        System.out.printf("Участник %s не смог преодолеть дорожку длиной %d метров %n", competitor, length);
        return false;
    }
}
