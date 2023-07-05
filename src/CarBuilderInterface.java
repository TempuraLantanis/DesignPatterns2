public interface CarBuilderInterface {


    void reset();
    void buildEngine(Engine engine);
    void buildInterior(int chairs, String stuurPos);
    void buildEntertainmentSystem(boolean entertainmentSystemExists, String... entertainmentSystemModel);
    void buildColor(String color);
    void buildTransmission(boolean automatic);
    Car getResult();


}
