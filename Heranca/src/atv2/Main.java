package atv2;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("xx","x-pro","2.5gz");
        Memoria memoria = new Memoria("ss2","pro-x","256gb","8gb");
        PlacaMae placaMae = new PlacaMae("pro","pps","256gb","2");



        System.out.println(processador.toString());
        System.out.println(memoria.toString());
        System.out.println(placaMae.toString());


    }
}
