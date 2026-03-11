package atv2;


public class DispositivoDeArm extends Componentes {
    private String capacidadeArm;
    private String tipoDeConexao;

    public DispositivoDeArm(String marca, String modelo, String capacidadeDeArm, String capacidadeArm, String tipoDeConexao) {
        super(marca, modelo, capacidadeDeArm);
        this.capacidadeArm = capacidadeArm;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeArm() {
        return capacidadeArm;
    }

    public void setCapacidadeArm(String capacidadeArm) {
        this.capacidadeArm = capacidadeArm;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArm{" +
                "capacidadeArm='" + capacidadeArm + '\'' +
                ", tipoDeConexao='" + tipoDeConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
