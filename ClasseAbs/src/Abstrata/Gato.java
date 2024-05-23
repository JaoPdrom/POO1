package Abstrata;

public class Gato extends Animal {
    @Override
    public void locomover() {
        System.out.println("Abstrata.Gato andando");
    }

    @Override
    public void emitirsom() {
        System.out.println("Abstrata.Gato miando");
    }
}
