package atv4;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua indaia","41","225","ssa","444");
        Medico medico = new Medico("ste","ste",20000,
                new Endereco("rua inda","41","455","ssa","41280266"),"225");

        Engenheiro engenheiro = new Engenheiro("stephanie","555",6000, new Endereco("rua regis","45","41","ssa","5456445454"),"222");

        System.out.println(medico.toString());
        System.out.println(endereco.toString());


    }
}
