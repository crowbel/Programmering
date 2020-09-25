package Arrays1;

public class Oppg3 {
    public static void main(String[] args) {

        String [] a = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};

        for(int i = 0; i < a.length; i+=2){
            System.out.println(a[i] + " " + a[i+1]);
        }


    }
}
