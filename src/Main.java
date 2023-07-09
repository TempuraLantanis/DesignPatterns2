public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        builder.reset();
        director.makeSportCar(builder);
        Car car = builder.getResult();
        car.engine.startEngine();
        CarbonDioxideInjector c1 = new CarbonDioxideInjector(car.engine);
        c1.stopEngine();

        PolicyBuilder policyBuilder = new PolicyBuilder();
        director.makePolicy(policyBuilder);
        Policy policy1 = policyBuilder.getResult();
        policy1.printPolicy();

        FuelType f1 = new FuelType(c1);
        f1.startEngine();


    }
}
