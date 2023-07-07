public class SportEngineCreator extends EngineCreator{


    @Override
    public Engine createEngine(String model){

        result.model = model;

        return result;
    }
}
