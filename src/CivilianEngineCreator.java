public class CivilianEngineCreator extends EngineCreator{
    @Override
    public Engine createEngine(String model) {
        this.result.model = model;

        return result;
    }
}
