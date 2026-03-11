package atv1;

public class Processador extends Componentes{
    private  double frequencia;

    public Processador(String marca, String modelo, double frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia=" + frequencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
