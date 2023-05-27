package N103;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class Exception_Test {
    @Test
    public void llancaExcepcio_Test(){
        ArrayIndexOutOfBoundsException ex1 = assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            new Exception(10);
        });
        String missatgeEsperat = "Expected exception: java.lang.ArrayIndexOutOfBoundsException";
        String missatgeObtingut = ex1.getMessage();
    }
}
