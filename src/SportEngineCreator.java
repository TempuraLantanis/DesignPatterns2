public class SportEngineCreator extends EngineCreator{


    @Override
    public SportEngine createEngine(String model,int horsePower){
        SportEngine engine = new SportEngine(model,horsePower);

        return engine;
    }
}
