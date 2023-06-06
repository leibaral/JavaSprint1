package N304;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class llista_Test {
    ObjecteTipus1 Obj1_1 = new ObjecteTipus1(1, 1);
    ObjecteTipus2 Obj2_1 = new ObjecteTipus2(2, "String2");
    ObjecteTipus3 Obj3_1 = new ObjecteTipus3("String3-1", "String3-2");
    ArrayList<Object> alObj = new ArrayList<>();

    @Test
    public void ordreInsercio_Test(){
        alObj.add(Obj1_1);
        alObj.add(Obj2_1);
        alObj.add(Obj3_1);
        List<Object> alObjOrdenat = Arrays.asList(Obj1_1, Obj2_1, Obj3_1); // guardem ordre inserció
        Assertions.assertThat(alObj).containsExactlyElementsOf(alObjOrdenat);
    }
    @Test
    public void llistaConte_Test(){
        alObj.add(Obj1_1);
        alObj.add(Obj2_1);
        alObj.add(Obj3_1);

        Assertions.assertThat(alObj).contains(Obj1_1);
        Assertions.assertThat(alObj).contains(Obj2_1);
        Assertions.assertThat(alObj).contains(Obj3_1);
    }
    @Test
    public void llistaElementUnSolCop_Test(){
        alObj.add(Obj1_1);
        alObj.add(Obj2_1);
        alObj.add(Obj3_1);

        Assertions.assertThat(alObj).containsOnlyOnce(Obj1_1);
        Assertions.assertThat(alObj).containsOnlyOnce(Obj2_1);
        Assertions.assertThat(alObj).containsOnlyOnce(Obj3_1);
    }
    @Test
    public void llistaFaltaElement_Test(){
        alObj.add(Obj1_1);
        //alObj.add(Obj2_1);
        alObj.add(Obj3_1);

        Assertions.assertThat(alObj).doesNotContain(Obj2_1);
    }
}




