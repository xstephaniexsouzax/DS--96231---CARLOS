package atv3;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("STEPHANIE", "75998670575", "02155", "56987","26.08.2026");
        Juridica juridica = new Juridica("e","71","02457","4578621");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
