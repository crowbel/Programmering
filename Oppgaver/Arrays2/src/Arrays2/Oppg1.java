package Arrays2;

import java.util.ArrayList;

public class Oppg1 {
    public static void main(String[] args) {


        ArrayList <Integer> liste = new ArrayList<>();

        for (int i = 1; i < 10; i++){

            liste.add(i);

        }

        System.out.println(liste.get(3));
        System.out.println(liste.get(6));

    }
}
