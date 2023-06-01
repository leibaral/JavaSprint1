package N201;

public class GenericMethods {
    public static <T> void printarArgs(String arg1, T arg2, T arg3){
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
