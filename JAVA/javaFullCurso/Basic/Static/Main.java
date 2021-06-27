package Basic.Static;

public class Main {
    
    public static void main(String[] args) {
        
        Friend friend1 = new Friend("Morty");
        Friend friend2 = new Friend("Rick");
        
        // System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
