package Constructor;

public class constructors {
    
    public static void main(String[] args) {
        
        Human human1 = new Human("Rick", 29, 70.56);
        Human human2 = new Human("Morty", 16, 60.36);

        System.out.println(human1.name);
        System.out.println(human2.age);

        human2.eat();
        human1.drink();
    }

}
