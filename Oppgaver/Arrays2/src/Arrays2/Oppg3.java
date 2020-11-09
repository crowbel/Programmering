package Arrays2;

import java.util.ArrayList;

public class Oppg3 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};

        ArrayList <Integer> liste = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            liste.add(a[i]);
        }


        for (int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i) + " ");
        }
    }
}
