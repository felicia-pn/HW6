package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class BetMore_Game {

    public static int pick_card() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i<=100; i++) {
            list.add(i);
        }

        if (Game_Chair.player_2.exists == false) {
            Collections.shuffle(list);
            return list.getFirst();
        }
        else {
            for (int i = 1; i<=5; i++) {
                Collections.shuffle(list);
            }
            return list.getFirst();
        }

    }
}
