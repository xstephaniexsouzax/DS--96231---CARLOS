package org.example.EX1;

public class Cachorro implements Animal{

    @Override
    public String emitirsom() {
        return "au-au";
    }

    @Override
    public String comer() {
        return "o cachorro comeu";
    }
}
