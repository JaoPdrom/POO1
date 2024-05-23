package Abstrata;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Baleia baleia = new Baleia();
        baleia.emitirsom();
        baleia.locomover();

        Gato gato = new Gato();
        gato.emitirsom();
        gato.locomover();

        Morcego morcego = new Morcego();
        morcego.emitirsom();
        morcego.locomover();
    }
}