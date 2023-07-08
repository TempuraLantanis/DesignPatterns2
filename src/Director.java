public class Director {
    CarBuilderInterface builder;


    public void changeBuilder(CarBuilderInterface otherBuilder){
        this.builder = otherBuilder;

    }


    public void createMSport(String model){
        this.builder.reset();
        changeBuilder(new CarBuilder());
        SportEngineCreator engineCreator = new SportEngineCreator();
        this.builder.initiateCar(model);
        this.builder.buildEngine(engineCreator.createEngine("MD-SPRT21", 200));
        this.builder.buildEntertainmentSystem(true, "Celadan");
        this.builder.buildColor("Red");
        this.builder.buildAutoTransmission(false);

    }


    public void makeSuv(String model){
        this.builder.reset();
        changeBuilder(new CarBuilder());
        CivilianEngineCreator engineCreator = new CivilianEngineCreator();
        this.builder.initiateCar("SUV");

    }





}
