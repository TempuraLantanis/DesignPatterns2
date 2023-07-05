public abstract class EngineMod implements EngineInterface {
    EngineInterface wrappedEngine;

    public EngineMod(EngineInterface wrapped){
        this.wrappedEngine = wrapped;
    }


}
