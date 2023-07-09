public class PolicyBuilder implements CarBuilderInterface{
    Policy policy;

    @Override
    public void reset() {
        this.policy = new Policy();

    }

    @Override
    public void initiateCar(String model) {
        this.policy.carModel = model;

    }

    @Override
    public void buildEngine(EngineInterface engine) {
        this.policy.engineRegulation = "The " + engine + " must not exceed these limits";


    }

    @Override
    public void buildInterior(int chairs, String stuurPos) {
        this.policy.interiorRegulation = "With the following interior comprising of " + chairs + " passengers and with " +
                stuurPos +  " seat position" ;

    }

    @Override
    public void buildEntertainmentSystem(boolean entertainmentSystemExists, String entertainmentSystemModel) {
        if(entertainmentSystemExists){
            this.policy.entertainmentSystem = "the entertainment system with the model " + entertainmentSystemModel + " must not exceed 20 decibels";

        }
        else {
            this.policy.entertainmentSystem = " no entertainment system exists";

        }


    }

    @Override
    public void buildColor(String color) {
        this.policy.colorRegulation = "the color " + color + "must not contain toxic materials";


    }

    @Override
    public void buildAutoTransmission(boolean automatic) {
        if(automatic){
            this.policy.autoTransmission = "must have so and so for an auto transmission";


        }
        else {
            this.policy.autoTransmission = "must have so and so for a manual transmission";

        }

    }

    public Policy getResult() {
        return this.policy;


    }
}
