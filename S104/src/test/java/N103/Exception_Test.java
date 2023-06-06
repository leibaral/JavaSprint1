package N103;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class Exception_Test {
    @Test
    public void llancaExcepcio_Test(){
        IndexOutOfBoundsException ex1 = assertThrows(IndexOutOfBoundsException.class, ()->{
            new Exception(10);
        });
        String missatgeEsperat = "L'índex és fora dels limits permesos";
        String missatgeObtingut = ex1.getMessage();
        System.out.println(missatgeObtingut);
        Assert.assertTrue(missatgeEsperat == missatgeObtingut);
    }
}
