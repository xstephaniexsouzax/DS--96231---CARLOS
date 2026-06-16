package org.example.atv2;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");


    public String texo;

    private Sexo(String texo) {
        this.texo = texo;
    }

    public String getTexo() {
        return texo;
    }

    
    
    

}
