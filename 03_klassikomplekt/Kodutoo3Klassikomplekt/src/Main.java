public class Main {
    public static void main(String[] args) {
        Loom koer = new Loom("Muki", 4, "Koer");
        Omanik omanik = new Omanik("Juta", "56655665", "juta.jutake@mail.com");

        Loomakliinik kliinik = new Loomakliinik(koer, omanik);

        kliinik.kuvaLoomaAndmed();
        kliinik.kuvaOmanikuAndmed();
    }
}