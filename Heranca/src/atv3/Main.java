package atv3;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("s","759","78","58");
        Juridica juridica = new Juridica("e","71","02457","4578621");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
