package N102;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Persona pers1 = new Persona("Joan", "Fritz", 87);
        String professio = "jubilat";
        int fills = 8;

        /*
        System.out.println("Primer ordre:");
        GenericMethods.printarArgs(pers1, professio, fills);    //dóna error: el primer argument ha de ser String
        */

        System.out.println("Segon ordre:");
        GenericMethods.printarArgs(professio, pers1, fills);


    }
}
