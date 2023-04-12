public class Main {
    public static void main(String[] args) {
        Kass kass = new Kass(3, "Miisu", "pruun");
        Koer koer = new Koer(5, "Pontu", "must");

        System.out.println(kass.tutvusta());
        System.out.println(kass.heli());
        System.out.println(koer.tutvusta());
        System.out.println(koer.heli());
    }
}
