import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {
        
        int temp = 25;


        if(temp > 30){
            System.out.println("It Is Hot outside");
        }
        else if(temp >= 20 && temp <= 30){
            System.out.println("It Is warm outside");
        }
        else{
            System.out.println("It Is cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playng a game!Press q or Q to Exit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("Quiting");
        }
        else{
            System.out.println("You are still playng game");
        }

        scanner.close();


    }
}
