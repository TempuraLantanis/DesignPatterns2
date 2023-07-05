import java.util.Random;


public class Car {
    int passengers;
    String model;
    String licenseNumber;
    Engine engine;
    String exteriorColor;
    String interiorStyle;
    String entertainmentSystem;
    String transMissionType;


    public Car(){
        Random random = new Random();
        this.licenseNumber = Integer.toString(random.nextInt());

    }



    public void drive(){
        System.out.println("Driving car with license" + this.licenseNumber);

    }



}
