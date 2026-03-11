package atv1;

public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador("Intel","i5",2.5);
        Memoria m1 = new Memoria("kingston","3",500.05);

        System.out.println(p1.toString());
        System.out.println(m1.toString());

    }
}
