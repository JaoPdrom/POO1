package Abstrata;

public class Morcego extends Animal{
    @Override
    public void locomover() {
        System.out.println("Morcendo voando");
    }

    @Override
    public void emitirsom() {
        System.out.println("Abstrata.Morcego emitindo som");
    }
}
