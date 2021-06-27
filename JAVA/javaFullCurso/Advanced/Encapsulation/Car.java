package Advanced.Encapsulation;

public class Car {
    
    private String model;
    private String make;
    private int year;

    Car(String model, String make, int year){

        this.model = model;
        this.make = make;
        this.year =year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYear(int year){
        this.year = year;
    }
}
