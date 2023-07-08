public class CivilianEngineCreator extends EngineCreator{

    @Override
    public CivilianEngine createEngine(String model, int horsePower) {
        CivilianEngine engine = new CivilianEngine(model,horsePower);
        return engine;
    }
}
