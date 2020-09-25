package Arrays1;

public class Oppg7 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};

        int oddetall = 0;
        int partall = 0;

        for(int i = 0; i < a.length; i++){

            if(a[i] % 2 == 0){
                partall++;
            }
            else{
                oddetall++;
            }
        }
        System.out.println("Antall partall: " + partall);
        System.out.println("Antall oddetall: " + oddetall);

    }
}
