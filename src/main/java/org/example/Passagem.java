package org.example;
public class Passagem extends Setor {

    private static Passagem Passagem = new Passagem();

    private Passagem() {};
    public static Passagem getInstancia() {
        return Passagem;
    }

}