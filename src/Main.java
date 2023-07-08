public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        builder.reset();
        director.makeSportCar(builder);
        Car car = builder.getResult();

    }
}
