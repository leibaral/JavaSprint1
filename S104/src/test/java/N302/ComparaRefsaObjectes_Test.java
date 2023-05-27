package N302;
import org.assertj.core.api.Assertions;
import org.junit.Test;
public class ComparaRefsaObjectes_Test {
    @Test
    public void ComparaRefaObjectesIguals(){
        Object obj1 = new Object();
        Object obj2 = obj1;
        Assertions.assertThat(obj1).isSameAs(obj2);
    }
    @Test
    public void ComparaRefaObjectesDiferents(){
        Object obj3 = new Object();
        Object obj4 = new Object();
        Assertions.assertThat(obj3).isNotSameAs(obj4);
    }
}
