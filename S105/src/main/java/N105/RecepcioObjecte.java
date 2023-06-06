package N105;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RecepcioObjecte implements Serializable {
    static void rebre(){
        try{
            ObjectInputStream llegintArxiu = new ObjectInputStream(new FileInputStream("src/main/java/N105/resultat.ser"));
            ArrayList<Vehicle> arxiuRecuperat = (ArrayList<Vehicle>) llegintArxiu.readObject();
            llegintArxiu.close();

            for(Vehicle v : arxiuRecuperat){
                System.out.println(v);
            }
        }catch(Exception e){e.printStackTrace();}
    }



}
