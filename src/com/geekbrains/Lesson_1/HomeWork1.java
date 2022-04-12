package com.geekbrains.Lesson_1;

import com.geekbrains.Lesson_1.Competitors.Cat;
import com.geekbrains.Lesson_1.Competitors.Competitor;
import com.geekbrains.Lesson_1.Competitors.Human;
import com.geekbrains.Lesson_1.Competitors.Robot;
import com.geekbrains.Lesson_1.Obstacles.Obstacle;
import com.geekbrains.Lesson_1.Obstacles.River;
import com.geekbrains.Lesson_1.Obstacles.Track;
import com.geekbrains.Lesson_1.Obstacles.Wall;

public class HomeWork1 {

    public static void main(String[] args) {
        Human human = new Human("Человек");
        Cat cat = new Cat("Кот");
        Robot robot = new Robot("Робот");

        Track track = new Track(100);
        Wall wall = new Wall(5);
        River river = new River(100);

        Competitor[] competitors = {human, cat, robot};
        Obstacle[] obstacles = {track, wall, river};

        for (Competitor competitor : competitors) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcomeObstacleBy(competitor)) {
                    System.out.printf("Участник %s ВЫБЫВАЕТ из соревнований %n", competitor);
                    break;
                }
            }
        }
    }
}
