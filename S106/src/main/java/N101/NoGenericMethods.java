package N101;

public class NoGenericMethods {

    private String objStr1;
    private String objStr2;
    private String objStr3;

    public NoGenericMethods(String objStr1, String objStr2, String objStr3){
        this.objStr1 = objStr1;
        this.objStr2 = objStr2;
        this.objStr3 = objStr3;
    }
    public void setString1(String newString1){
        this.objStr1 = newString1;
    }
    public String getString1(){
        return objStr1;
    }
    public void setString2(String newString2){
        this.objStr2 = newString2;
    }
    public String getString2(){
        return objStr2;
    }
    public void setString3(String newString3){
        this.objStr3 = newString3;
    }
    public String getString3(){
        return objStr3;
    }

}
