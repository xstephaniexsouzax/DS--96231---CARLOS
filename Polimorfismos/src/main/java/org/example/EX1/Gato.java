package org.example.EX1;

public class Gato implements Animal{
    @Override
    public String emitirsom() {
        return "miau";
    }

    @Override
    public String comer() {
        return "o gato comeu";
    }
}
