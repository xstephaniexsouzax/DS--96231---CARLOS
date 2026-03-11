package aula10032026;
//subclase
public class Cliente extends Pessoa{
    private String dataDeCompra;
    private String formaDePag;

    public Cliente(String nome, int idade, String dataDeCompra, String formaDePag) {
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        this.formaDePag = formaDePag;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormaDePag() {
        return formaDePag;
    }

    public void setFormaDePag(String formaDePag) {
        this.formaDePag = formaDePag;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDeCompra='" + dataDeCompra + '\'' +
                ", formaDePag='" + formaDePag + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
