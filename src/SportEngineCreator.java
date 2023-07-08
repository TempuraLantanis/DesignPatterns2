public class SportEngineCreator extends EngineCreator{


    @Override
    public SportEngine createEngine(String model){
        SportEngine engine = new SportEngine(model, 200);

        return engine;
    }
}
