import java.util.Random;


public class Car {
    int passengers;
    String model;
    String licenseNumber;
    EngineInterface engine;
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

    public void activateEntertainment(){
        System.out.println(entertainmentSystem);

    }

    public void getResult(){
        System.out.println("Model:" + this.model);
        System.out.println("License number: " + this.licenseNumber);
        System.out.println("Engine: " + this.engine);
        System.out.println("Exterior color: " + this.licenseNumber);
        System.out.println("Interior style: " + this.exteriorColor);
        System.out.println("passenger seats: " + this.passengers);
        System.out.println("Entertainment system: " + this.entertainmentSystem);
        System.out.println("Transmission type: " + this.transMissionType);
        System.out.println("-------------------------------");


    }



}
