package com.geekbrains.lesson_1.Competitor;

public class Team {
    private String title;
    private Competitor[] members;

    public Competitor[] getMembers() {
        return members;
    }

    public Team(String title, Competitor...members) {
        this.title = title;
        this.members = members;
    }

    public void showWinners() {
        for(Competitor o: members) {
            if(o.isOnDistance()) {
                o.info();
            }
        }
    }
}
