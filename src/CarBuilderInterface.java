public interface CarBuilderInterface {


    void reset();
    void buildEngine(Engine engine);
    void buildInterior(int chairs, String stuurPos);
    void buildEntertainmentSystem(boolean value);
    void buildColor(String color);
    void buildTransmission();
    Car getResult();


}
