public abstract class Engine implements EngineInterface {

    public int horsePower;
    public String model;
    public int cylinders;
    public String fuelType;


    @Override
    public void startEngine(){
        System.out.println("Starting" + model +" engine with " + horsePower +" horsepower");
        System.out.println("Engine has" + cylinders + " cylinders");


    }

    @Override
    public void stopEngine(){


    }


}
