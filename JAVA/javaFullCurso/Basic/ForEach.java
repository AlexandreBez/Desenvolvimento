package Basic;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        
        // String[] animals = {"Cat", "Dog", "Bird"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Anten");

        for(String i : animals){
            System.out.println(i);
        }
    }
}
