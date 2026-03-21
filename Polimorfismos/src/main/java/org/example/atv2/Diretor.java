package org.example.atv2;

public class Diretor extends Funcionario implements IContratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String admitir(Funcionario funcionario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'admitir'");
    }

    @Override
    public String demitir(Funcionario funcionario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'demitir'");
    }

    @Override
    public double getSalarioFinal() {
        
        double salarioFinal = super.salarioBase;
        salarioFinal += super.salarioBase * this.PREMIO;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", PREMIO=" + PREMIO + ", sexo=" + sexo
                + ", setor=" + setor + ", salarioBase=" + salarioBase + ", getPREMIO()=" + getPREMIO() + ", getNome()="
                + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getSalarioFinal()="
                + getSalarioFinal() + ", getSexo()=" + getSexo() + ", getSetor()=" + getSetor() + ", getSalarioBase()="
                + getSalarioBase() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
    


    
}
