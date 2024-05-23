package Abstrata;

public class Baleia extends Animal{
    @Override
    public void locomover() {
        System.out.println("Abstrata.Baleia nadando");
    }

    @Override
    public void emitirsom() {
        System.out.println("Abstrata.Baleia emitindo som");
    }
}
