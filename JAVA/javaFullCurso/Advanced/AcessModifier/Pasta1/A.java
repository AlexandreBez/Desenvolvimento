package Advanced.AcessModifier.Pasta1;
import Advanced.AcessModifier.Pasta2.*;

public class A {
    
    // protected String protectedMessage = "This is protected";

    public static void main(String[] args){
        
        B b = new B();

        System.out.println(b.privateMessage);
    }
}
