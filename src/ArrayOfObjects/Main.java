package ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Food food1=new Food("Pizza");
        Food food2=new Food("ketchup");
        Food food3=new Food("Fries");
        Food[] refrigerator={food1,food2,food3};
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


    }
}
