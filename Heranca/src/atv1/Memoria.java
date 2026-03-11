package atv1;

public class Memoria extends Componentes{
    private double capacidadeDeArm;

    public Memoria(String marca, String modelo, double capacidadeDeArm) {
        super(marca, modelo);
        this.capacidadeDeArm = capacidadeDeArm;
    }

    public double getCapacidadeDeArm() {
        return capacidadeDeArm;
    }

    public void setCapacidadeDeArm(double capacidadeDeArm) {
        this.capacidadeDeArm = capacidadeDeArm;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeArm=" + capacidadeDeArm +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
