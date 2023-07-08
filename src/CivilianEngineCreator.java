public class CivilianEngineCreator extends EngineCreator{
    @Override




    public Engine createEngine(String model) {
        this.result.model = model;
        this.result.cylinders = 4;
        this.result.fuelType  = "Gasoline";
        return result;
    }
}
