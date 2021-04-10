package POO;

public class Main extends Car{
    public static void main(String[] args) {
        
        Car mycar = new Car();

        System.out.println(mycar.model);
        System.out.println(mycar.color);
        System.out.println(mycar.make);
        System.out.println(mycar.price);

        mycar.drive();
        mycar.brake();
    }
}
