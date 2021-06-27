package Basic;
public class SWITCHES{
    public static void main(String[] args) {
        
        String day = "Friday";

        switch(day) {
            case "Sunday": System.out.println("It Is Sunday!");
            break;
            case "Monday": System.out.println("It Is Monday!");
            break;
            case "Tuesday": System.out.println("It Is Tuesday!");
            break;
            case "Wednesday": System.out.println("It Is Wednesday!");
            break;
            case "Thursday": System.out.println("It Is Thursday!");
            break;
            case "Friday": System.out.println("It Is Friday!");
            break;
            case "Saturday": System.out.println("It Is Saturday!");
            break;
            default:System.out.println("ERROR");
            break;
        }
    }
}