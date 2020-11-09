package Arrays2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Oppg4 {
    public static void main(String[] args) {

        ArrayList <Integer> liste = new ArrayList<>();

        for(int i = 1; i < 10; i++){
            liste.add(i);
        }

        int [] a = new int[liste.size()];

        for (int i = 0; i < liste.size(); i++){

             a[i] = liste.get(i);
        }

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
