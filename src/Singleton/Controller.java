package Singleton;

public class Controller {
    public static void main(String[] args) {
        SingletonExemplo exemplo1 = SingletonExemplo.getINSTANCE();
        SingletonExemplo exemplo2 = SingletonExemplo.getINSTANCE();

        System.out.println(exemplo1.hashCode());
        System.out.println(exemplo2.hashCode());

    }

}
