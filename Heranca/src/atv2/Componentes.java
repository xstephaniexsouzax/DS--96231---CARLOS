package atv2;

public abstract class Componentes {
    protected String marca;
    protected String modelo;
    private String capacidadeDeArm;

    public Componentes(String marca, String modelo, String capacidadeDeArm) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArm = capacidadeDeArm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeDeArm() {
        return capacidadeDeArm;
    }

    public void setCapacidadeDeArm(String capacidadeDeArm) {
        this.capacidadeDeArm = capacidadeDeArm;
    }

    @Override
    public String toString() {
        return "Componentes{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeDeArm='" + capacidadeDeArm + '\'' +
                '}';
    }
}
