public class SportEngine implements EngineInterface {


    int horsePower;
    String model;

    public SportEngine(String model,int horsePower){
        this.horsePower = horsePower*100;
        this.model = model;
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
