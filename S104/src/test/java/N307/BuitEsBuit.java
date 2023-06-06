package N307;

import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.assertFalse;

public class BuitEsBuit {

    @Test
    public void buitEsBuit(){
        Optional<String> opt1 = Optional.empty();
        assertFalse(opt1.isPresent());
    }

}
