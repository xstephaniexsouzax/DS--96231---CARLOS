package org.example.atv2;

public class Motoboy extends Funcionario{
    private String carteiraHabilitacao;

    

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase,
            String carteiraHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy [nome=" + nome + ", carteiraHabilitacao=" + carteiraHabilitacao + ", dataNascimento="
                + dataNascimento + ", sexo=" + sexo + ", setor=" + setor + ", salarioBase=" + salarioBase
                + ", getSalarioFinal()=" + getSalarioFinal() + ", getCarteiraHabilitacao()=" + getCarteiraHabilitacao()
                + ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getSexo()="
                + getSexo() + ", getSetor()=" + getSetor() + ", getSalarioBase()=" + getSalarioBase() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    @Override
    public double getSalarioFinal() {
       return super.salarioBase;
    }
    

    



    
}
