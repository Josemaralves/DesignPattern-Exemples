package Adapter;

public class Adapter extends Garafa{

    private Copo copo;

    public Adapter(Copo copo){
        this.copo = copo;
    }

    public void encher() {
        copo.beber();
    }
}
