public class SportEngine implements EngineInterface {


    public int horsePower;
    public String model;
    public int cylinders;
    public String fuelType;

    public SportEngine(String model,int horsePower){
        this.horsePower = horsePower*100;
        this.model = model;
        this.cylinders = 8;
        this.fuelType = "Gasolina sharp";
    }


    public String getEngineStats(){
        return "Model: " + model + ", Horse power: " + horsePower + ", Cylinders: " +  cylinders + ", Fuel type: " + fuelType; 
    }



    @Override
    public void startEngine() {
        System.out.println("Starting a unmodded SportsEngine with " + this.horsePower + " Horsepower");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping a unmodded SportsEngine with " + this.horsePower + " Horsepower");


    }
}
