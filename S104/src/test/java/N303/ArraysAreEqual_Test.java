package N303;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAreEqual_Test {

    @Test
    public void ArraysAreEqual(){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        Assertions.assertArrayEquals(arr1, arr2);
    }

}
