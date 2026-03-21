package atv2;

public class Processador extends Componentes{
    private String frequencia;

    public Processador(String marca, String modelo, String capacidadeDeArm, String frequencia) {
        super(marca, modelo, capacidadeDeArm);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
