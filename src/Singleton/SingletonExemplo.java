package Singleton;

public class SingletonExemplo {

    private static final SingletonExemplo INSTANCE = new SingletonExemplo();
    
    private SingletonExemplo(){}

    public static SingletonExemplo getINSTANCE() {
        return INSTANCE;
    }
}
