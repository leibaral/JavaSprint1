package N306;

import org.junit.Assert;

public class Excepcio {
    int massaAlt;
    public void excepcio(int massaAlt){
        this.massaAlt = massaAlt;
        String[] llistaStrings = new String[] { "A", "B", "C", "D" };
        System.out.println(llistaStrings[massaAlt]);
    }
}
