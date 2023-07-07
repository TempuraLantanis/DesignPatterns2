public class Director {
    CarBuilderInterface builder;


    public void changeBuilder(CarBuilderInterface otherBuilder){
        this.builder = otherBuilder;

    }


    public Car makeSportCar(String model){





        return builder.getResult();
    }


    public void makeSuv(){

    }






}
