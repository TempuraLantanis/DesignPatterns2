public class CarBuilder implements CarBuilderInterface {



    Car car;

    @Override
    public void reset(){

    }

    @Override
    public void initiateCar(String model) {
        car.model = model;

    }


    @Override
    public void buildEngine(Engine engine) {
        car.engine = engine;
    }


    @Override
    public void buildInterior(int chair, String stuurPos){
        car.interiorStyle= "The interior contains "
                + chair +
                "with the driverposition at" + stuurPos;

        car.passengers = chair;

    }

    @Override
    public void buildEntertainmentSystem(boolean entertainmentSystemExists, String... entertainmentSystemModel) {
        if (entertainmentSystemExists){
            System.out.println("building the Entertainment System");
            car.entertainmentSystem = "The entertainment system exists with the model" + entertainmentSystemModel;

        }
        else{
            car.entertainmentSystem = "This car doesn't have an entertainment system";
        }
    }



    @Override
    public void buildColor(String extcolor) {
        car.exteriorColor = extcolor;

    }

    @Override
    public void buildTransmission(boolean automatic) {
        if(automatic){
            car.transMissionType = "automatic";
        }
        else {
            car.transMissionType = "false";
        }

    }

    @Override
    public Car getResult() {
        return car;
    }
}
