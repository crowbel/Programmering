package forWhile;

import java.sql.SQLOutput;

public class Oppg4 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for(int i = 0; i < 100; i++){
            if (i % 2 == 0){
                sum = i + sum;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
