package atv2;



public class Memoria extends Componentes {
    private String capacidadeArm;

    public Memoria(String marca, String modelo, String capacidadeDeArm, String capacidadeArm) {
        super(marca, modelo, capacidadeDeArm);
        this.capacidadeArm = capacidadeArm;
    }

    public String getCapacidadeArm() {
        return capacidadeArm;
    }

    public void setCapacidadeArm(String capacidadeArm) {
        this.capacidadeArm = capacidadeArm;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeArm='" + capacidadeArm + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
