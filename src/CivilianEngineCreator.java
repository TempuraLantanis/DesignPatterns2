public class CivilianEngineCreator extends EngineCreator{


    @Override
    public CivilianEngine createEngine(String model) {
        CivilianEngine engine = new CivilianEngine(model);
        return engine;
    }
}
