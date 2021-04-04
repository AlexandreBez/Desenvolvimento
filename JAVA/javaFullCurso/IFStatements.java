public class IFStatements {
    public static void main(String[] args) {
        
        int age = -45;

        if(age < 18) {
            System.out.println("Menor de idade. Entrada Proibida");
        }else if(age >= 18){
            System.out.println("Seja Bem-Vindo");
        }else{
            System.out.println("Exit code = 0");
        }
    }
}
