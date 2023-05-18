package N2E1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Entrada {
    public static void main (String[] args) {

        //mètodes amb l'excepció de la classe InputMismatchException:

        System.out.println("Has entrat: " + llegirByte("Introdueix la teva edat en byte"));
        System.out.println("Has entrat: " + llegirInt("Introdueix la teva edat en sencers"));
        System.out.println("Has entrat: " + llegirFloat("Introdueix la teva edat en float"));
        System.out.println("Has entrat: " + llegirDouble("Introdueix la teva edat en double"));

        //mètodes amb l'excepció de la classe Exception:

        System.out.println("Has entrat: " + llegirChar("Introdueix la primera lletra del teu nom"));
        System.out.println("Has entrat: " + llegirString("Introdueix el teu email"));
        System.out.println("Has entrat: " + llegirSiNo("Introdueix S (sí) o N (no)"));


    }

    // MÈTODES QUE CAPTUREN L'EXCEPCIÓ InputMismatchException :
    public static byte llegirByte(String missatge){
        boolean entradaEsOK = false;
        while(!entradaEsOK) {
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                byte resposta = input.nextByte();
                entradaEsOK = true;
                input.nextLine();
                return resposta;
            } catch (InputMismatchException e) {
                System.out.println("Error de format: " + e.getClass().getName());
                input.nextLine();
            }
        }
        return 0;
    }

    public static int llegirInt(String missatge){
        boolean entradaEsOK = false;
        while(!entradaEsOK) {
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                int resposta = input.nextInt();
                entradaEsOK = true;
                input.nextLine();
                return resposta;
            } catch (InputMismatchException e) {
                System.out.println("Error de format: " + e.getClass().getName());
                input.nextLine();
            }
        }
        return 0;
    }

    public static float llegirFloat(String missatge){
        boolean entradaEsOK = false;
        while(!entradaEsOK) {
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                float resposta = input.nextFloat();
                entradaEsOK = true;
                input.nextLine();
                return resposta;
            } catch (InputMismatchException e) {
                System.out.println("Error de format: " + e.getClass().getName());
                input.nextLine();
            }
        }
        return 0;
    }

    public static double llegirDouble(String missatge) {
        boolean entradaEsOK = false;
        while(!entradaEsOK) {
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                double resposta = input.nextDouble();
                entradaEsOK = true;
                input.nextLine();
                return resposta;
            } catch (InputMismatchException e) {
                System.out.println("Error de format: " + e.getClass().getName());
                input.nextLine();
            }
        }
        return 0;
    }

    // MÈTODES QUE LLENCEN L'EXCEPCIÓ heretada d'Exception I LA CAPTUREN :

    public static char llegirChar(String missatge) {
        boolean entradaEsOK = false;
        while(!entradaEsOK){
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                String resposta = input.nextLine();
                if(resposta.length() !=1){
                    throw new ErrorEntradaNoCompleix("Has d'escriure 1 sol caracter");
                }
                entradaEsOK = true;
                return resposta.charAt(0);
            } catch (ErrorEntradaNoCompleix e) {
                System.out.println("Format invàlid");
            }
        }
        return 0;
    }

    public static String llegirString(String missatge) {
        boolean entradaEsOK = false;
        while(!entradaEsOK){
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                String resposta = input.nextLine();
                if(!resposta.contains("@") || !resposta.contains(".")){
                    throw new ErrorEntradaNoCompleix("Entra un email vàlid");
                }
                entradaEsOK = true;
                return resposta;
            } catch (ErrorEntradaNoCompleix e) {
                System.out.println("Format invàlid");
            }
        }
        return " ";
    }

    public static boolean llegirSiNo(String missatge) {
        boolean entradaEsOK = false;
        boolean sn = false;
        while(!entradaEsOK){
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println(missatge);
                char resposta = input.nextLine().toUpperCase().charAt(0);
                if(resposta != 'S' && resposta != 'N' ){
                    throw new ErrorEntradaNoCompleix("Entra S ó N");
                } else {
                    if (resposta == 'S'){
                        sn = true;
                    }
                }
                entradaEsOK = true;
                return sn;
            } catch (ErrorEntradaNoCompleix e) {
                System.out.println("Format invàlid");
            }
        }
        return sn;
    }


}