package N101;

public class Main {
    public static void main(String[]args){
        NoGenericMethods ordre1 = new NoGenericMethods("cuinar", "menjar", "defecar");
        NoGenericMethods ordre2 = new NoGenericMethods("defecar", "cuinar", "menjar");
        NoGenericMethods ordre3 = new NoGenericMethods("menjar", "cuinar", "defecar");
        NoGenericMethods ordre4 = new NoGenericMethods("menjar", "defecar", "cuinar");

        System.out.println(ordre1.getString3());
        System.out.println(ordre2.getString1());
        System.out.println(ordre3.getString3());
        System.out.println(ordre4.getString2());
    }
}
