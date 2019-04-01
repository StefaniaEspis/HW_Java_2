package com.geekbrains.lesson_1;

import com.geekbrains.lesson_1.Competitor.*;
import com.geekbrains.lesson_1.Obstacle.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Нинзя",new Human("Микелянджело"),new Alien("Донателло"),new Cat("Рафаэль"),new Dog("Леонардо"));
        Obstacle[] obstacles = {new Cross(75),new Wall(3),new Water(120)};
        Course course = new Course(obstacles);
        course.doIt(team);
        team.showWinners();
    }
}
