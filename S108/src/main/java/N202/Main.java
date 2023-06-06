package N202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 9, 14, 25, 2, 36, 12, 33);
        String cadena = obtindreCadena(nums);
        System.out.println("\n"+cadena);
    }

    public static String obtindreCadena(List<Integer> nums) {
        StringBuilder stb = new StringBuilder();
        for (Integer n: nums){
            stb.append(n % 2 == 0 ? "e" : "o").append(n).append(",");
        }
        if(stb.length()>0){
            stb.deleteCharAt(stb.length()-1);
        }
        return stb.toString();
    }
}
