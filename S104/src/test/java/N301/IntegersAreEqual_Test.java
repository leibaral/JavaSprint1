package N301;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class IntegersAreEqual_Test {
    @Test
    public void IntegersAreEqual_Test(){
        CompareInts comp1 = new CompareInts(33, 33);
        Assertions.assertThat(comp1.getA()).isEqualTo(comp1.getB());
    }
    @Test
    public void IntegersAreNotEqual_Test(){
        CompareInts comp2 = new CompareInts(7, 14);
        Assertions.assertThat(comp2.getA()).isNotEqualTo(comp2.getB());
    }
}
