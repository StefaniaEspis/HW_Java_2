package com.geekbrains.lesson_1.Obstacle;

import com.geekbrains.lesson_1.Competitor.Competitor;

public class Water extends Obstacle {
    int lenght;
    public Water(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void doIt(Competitor competitor){
        competitor.swim(lenght);
    }

}
