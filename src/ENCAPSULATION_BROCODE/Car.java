package ENCAPSULATION_BROCODE;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
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

    public void setYear(int year){
        this.year=year;
    }

}
