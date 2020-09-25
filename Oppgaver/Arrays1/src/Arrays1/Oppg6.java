package Arrays1;

public class Oppg6 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,5,5};

        for(int i = 0; i < a.length; i++){
            if(a[i] == b[i]){
                System.out.println("Løkkene sin " + i + " posisjon er lik.");
            }
            else{
                System.out.println("Løkkene er ikke like i posisjon " + i);
            }
        }
    }
}
