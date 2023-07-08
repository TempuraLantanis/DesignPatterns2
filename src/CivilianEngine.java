public class CivilianEngine implements EngineInterface {
    String model;
    int cylinders;





    public CivilianEngine(String m){
    this.model = m;

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
