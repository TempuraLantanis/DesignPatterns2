public class SportEngine extends Engine {

    public SportEngine(String model,int horsePower){
        this.horsePower = horsePower;
        this.model = model;
    }


    {
        horsePower = this.horsePower*1000;
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
