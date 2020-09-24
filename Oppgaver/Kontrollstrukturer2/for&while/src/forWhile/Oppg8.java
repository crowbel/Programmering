package forWhile;

public class Oppg8 {
    public static void main(String[] args) {

        int antall = 0;
        int sum = 0;
        int i = 0;
        while(i < 100){
            if(i % 2 == 0){
                antall++;
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum / antall);

    }
}
