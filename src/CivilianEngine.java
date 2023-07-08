public class CivilianEngine implements EngineInterface {



    public int horsePower;
    public String model;
    public int cylinders;
    public String fuelType;




    public CivilianEngine(String m, int horsePower){
    this.model = m;
    this.cylinders = 4;
    this.fuelType = "Gasoline";
    this.horsePower = horsePower;

    }






    @Override
    public void startEngine() {

        System.out.println("Starting a unmodded Civy engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping a civy engine");

    }
}
