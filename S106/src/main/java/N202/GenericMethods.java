package N202;

public class GenericMethods {
    public static <T> void printarArgs(T... args){
        for(T arg : args) {
            System.out.println(arg);
        }
    }
}
