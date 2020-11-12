package motorvogn;

public class MotorvognReg {
    public static void main(String[] args) {

        //opprett array av Biler
        Kjøretøy [] register = new Kjøretøy[100];

        //Opprett en ny dato
        Dato dato1 = new Dato(5,12,1998);

        //Sett inn noen biler i arrayet
        Bil bmw = new Bil("BMW i3", dato1, "BF 789345", 750);

        register[0] = bmw;

        Dato dato2 = new Dato(3,8,1973);

        Motorsykkel ducatti = new Motorsykkel("Ducatti", dato2, "GF 47534");


        register[1] = ducatti;

        for(Kjøretøy etkjøretøy : register){
            if (etkjøretøy != null){
                System.out.println(etkjøretøy);
                System.out.println("-----");
            }
        }
    }
}
