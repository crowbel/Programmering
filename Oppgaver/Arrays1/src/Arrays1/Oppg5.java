package Arrays1;

public class Oppg5 {
    public static void main(String[] args) {
        int [] a = {45,34,5,8,10,2,13,25};

        int størst = a[0];
        int minst = a[0];

        for(int i = 0; i < a.length; i++){
            if(minst > a[i]){
                minst = a[i];
            }
            if(størst < a[i]){
                størst = a[i];
            }
        }
        System.out.println(minst);
        System.out.println(størst);
    }
}
