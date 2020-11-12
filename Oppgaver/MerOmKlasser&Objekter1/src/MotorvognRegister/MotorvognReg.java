package MotorvognRegister;

public class MotorvognReg {
    public static void main(String[] args) {

        //opprett et array av Biler
        Bil [] register = new Bil[100];

        Dato dato1 = new Dato(5,10, 2018);

        //sett inn noen biler i arrayet
        Bil Wolkswagen = new Bil("Wolkswagen Golf GT", dato1,"CV 754322");


        Dato dato2 = new Dato(5,12,1998);

        Bil Audi = new Bil("Audi A6", dato2, "BP75321");


        //List motorvognregisteret (arrayet) ved hjelp av en løkke

        register[0] = Wolkswagen;
        register[1] = Audi;

        for(Bil enBil : register){
            if(enBil != null){
                System.out.println(enBil);
                System.out.println("-----");
            }
        }

    }
}
