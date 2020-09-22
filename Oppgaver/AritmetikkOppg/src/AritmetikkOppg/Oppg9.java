package AritmetikkOppg;

public class Oppg9 {
    public static void main(String [] args){
        //Hva gir de ulike logiske utrykkene under(anngi om de blir true eller false):

        int tall1 = 5;
        int tall2 = 4;

        boolean result1 = tall1 == tall2; //False fordi tall1 og tall2 ikke er det SAMME tallet.
        System.out.print(result1 + "\n");
        boolean result2 = tall1 != tall2; //True fordi det stemmer at tall1 og tall2 er IKKE LIKE.
        System.out.print(result2 + "\n");
        boolean result3 = tall1 <= tall2; //False fordi tall2 ikke er STØRRE eller LIK tall1.
        System.out.print(result3 + "\n");
        boolean result4 = tall1 >= tall2; //True fordi tall1 er STØRRE eller lik tall2.
        System.out.print(result4 + "\n");
        boolean result5 = tall1 < tall2; //False fordi det ikke stemme at tall2 er større enn tall1.
        System.out.print(result5 + "\n");
        boolean result6 = tall1 > tall2; //True fordi det stemmer at tall1 er større en tall2.
        System.out.print(result6);

    }
}
