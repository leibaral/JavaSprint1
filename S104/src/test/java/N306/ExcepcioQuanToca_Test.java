package N306;

import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Assert;
import org.junit.Test;

public class ExcepcioQuanToca_Test {
    @Test
    public void excepcioQuanToca(){
        try{
            Excepcio exc1 = new Excepcio();
            exc1.excepcio(4);
            Assert.fail("L'error ha aparegut abans d'hora");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
