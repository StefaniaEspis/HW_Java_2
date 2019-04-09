package com.geekbrains.lesson_1.Obstacle;

import com.geekbrains.lesson_1.Competitor.Competitor;

public class Cross extends Obstacle{
    int lenght;
    public Cross(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void doIt (Competitor competitor){
        competitor.run(lenght);
    }

}
