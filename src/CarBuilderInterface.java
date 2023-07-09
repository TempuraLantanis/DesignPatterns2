public interface CarBuilderInterface {


    void reset();
    void initiateCar(String model);
    void buildEngine(EngineInterface engine);
    void buildInterior(int chairs, String stuurPos);
    void buildEntertainmentSystem(boolean entertainmentSystemExists, String entertainmentSystemModel);
    void buildColor(String color);
    void buildAutoTransmission(boolean automatic);



}
