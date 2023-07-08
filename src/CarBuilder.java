public class CarBuilder implements CarBuilderInterface {

    Car car;

    @Override
    public void reset(){
        this.car = new Car();

    }

    @Override
    public void initiateCar(String model) {
        this.car.model = model;

    }


    @Override
    public void buildEngine(EngineInterface engine) {





    }


    @Override
    public void buildInterior(int chair, String stuurPos){
        this.car.interiorStyle= "The interior contains "
                + chair +
                "with the driverposition at" + stuurPos;

        this.car.passengers = chair;

    }

    @Override
    public void buildEntertainmentSystem(boolean entertainmentSystemExists, String... entertainmentSystemModel) {
        if (entertainmentSystemExists){
            System.out.println("building the Entertainment System");
            this.car.entertainmentSystem = "The entertainment system exists with the model" + entertainmentSystemModel;

        }
        else{
            this.car.entertainmentSystem = "This car doesn't have an entertainment system";
        }
    }



    @Override
    public void buildColor(String extcolor) {
        this.car.exteriorColor = extcolor;

    }

    @Override
    public void buildAutoTransmission(boolean automatic) {
        if(automatic){
            this.car.transMissionType = "automatic";
        }
        else {
            this.car.transMissionType = "false";
        }

    }

    @Override
    public Car getResult() {
        return this.car;
    }
}
