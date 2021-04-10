public class PrintF {
    public static void main(String[] args) {
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "bro";
        int myInt = 18;
        double myDouble = 12.586;

        System.out.printf("%b ", myBoolean);
        System.out.printf("%c ", myChar);
        System.out.printf("%-10s ", myString);
        System.out.printf("%d ", myInt);
        System.out.printf("%,f ", myDouble);    
    
    }
}
