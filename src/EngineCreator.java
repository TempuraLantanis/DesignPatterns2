public abstract class EngineCreator {

    public void diagnose(){
        System.out.println("diagnosing");
    }

    public abstract EngineInterface createEngine(String model, int horsePower);
}
