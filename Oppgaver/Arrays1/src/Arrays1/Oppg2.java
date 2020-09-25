package Arrays1;

public class Oppg2 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};

        int sum = 0;
        int sum5 = 0;
        int antall = 0;
        int antall5 = 0;
        for(int i = 0; i < a.length; i++){
           sum = sum + a[i];
           antall++;

           if(a[i] > 5){
               sum5 = sum5 + a[i];
               antall5++;
           }

        }
        int snitt = sum / antall;
        int snitt5 = sum5 / antall5;

        System.out.println(snitt);
        System.out.println(snitt5);


    }
}
