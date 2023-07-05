public class CarbonDioxideInjector extends EngineMod{


    public CarbonDioxideInjector(EngineInterface wrapped) {
        super(wrapped);
    }

    @Override
    public void startEngine() {

        System.out.println("Starting engine with CO2Injector");

    }

    @Override
    public void stopEngine() {

        System.out.println("Stopping Dramatically");

    }
}
