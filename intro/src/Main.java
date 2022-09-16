

public class Main {
    public static void main (String[] args){

        System.out.println("Hello World");

        //variables
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;


        // if - else
        String okYonu = "";
        if(dolarBugun<dolarDun) { //false
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun){
            okYonu="up.svg";
            System.out.println(okYonu);
        }else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }


        // array
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        // simplest method to print all arrays elements to the screen
        System.out.println(krediler[0]);
        System.out.println(krediler[0]);
        System.out.println(krediler[0]);


        // printing array elements to screen using loops
        for(int i =0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }
    }
}
