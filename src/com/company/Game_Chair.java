package com.company;

public class Game_Chair {

    public static Player computer;
    public static Player player_2;
    public int a;
    public int b;


    public Game_Chair() {

    }


    public void start() {
        computer.exists = true;
        a = computer.play();

        player_2.exists = true;
        b = player_2.play();

    }

    public Player findWinner(Player system, Player player_2) {
        if (a <= b) {
            return player_2;
        } else {
            return computer;
        }
    }



}
