package lesson17;

import java.util.Random;

public class Game {
    public static <T extends TeamRed> void getWinnerRed(T p1, T p2){
        Random r = new Random(){};
        int i = r.nextInt(0,2);
        if (i==1){
            System.out.println("Win " +p1.getTeamName());
        } else {
            System.out.println("Win " + p2.getTeamName());
            ываыва
                    ываыва
                    выаывавва
        }
    }
}
