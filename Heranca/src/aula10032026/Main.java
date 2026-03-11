package aula10032026;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Stephanie", 26,"10/03/2026","cartão de credito");
        Funcionario f1 =  new Funcionario("Elionao", 28, "0023","desenvolvedora",4500);

        System.out.println(c1.toString());
        System.out.println(f1.toString());

    }
}
