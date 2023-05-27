package N101;
import org.junit.Test;
import org.junit.Assert;

public class ComprovaMesosTest {
    CreaLlistaMesos llistaMesosTest = new CreaLlistaMesos();
    @Test
    public void llistaTe12Posicions_Test(){
        Assert.assertEquals(12, llistaMesosTest.creaMesos().size());
    }
    @Test
    public void llistaNotNull_Test(){
        Assert.assertNotNull(llistaMesosTest.creaMesos());
    }
    @Test
    public void llistaPos08Agost_Test(){
        Assert.assertTrue(llistaMesosTest.creaMesos().get(7)=="Agost");
    }

}
