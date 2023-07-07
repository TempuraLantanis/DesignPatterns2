public class FuelType extends EngineMod {


    public FuelType(EngineInterface wrapped) {
        super(wrapped);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine with a modified fuelengine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine with a modified fuelintake");

    }
}
