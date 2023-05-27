package N305;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {
    Map<Integer,String> nouMap = new HashMap<>();

    @Test
    public void conteClau_Test(){
        nouMap.put(1,"primer");
        Assertions.assertThat(nouMap).containsKey(1);
    }
}
