public class Komponent {
    private double kogusGrammides;
    private Toiduaine toiduaine;

    public Komponent(double kogus, Toiduaine toiduaine) {
        this.kogusGrammides = kogus;
        this.toiduaine = toiduaine;
    }

    public Komponent() {

    }

    public double getKogus() {
        return kogusGrammides;
    }

    public Toiduaine getToiduaine() {
        return toiduaine;
    }

    public double arvutaRasvad() {
        return toiduaine.arvutaRasvad(kogusGrammides);
    }
    Komponent kartulikomponent = new Komponent();
    Komponent hapukoorekomponent = new;
    Komponent vorstikomponent = new Komponent(60, "Vorst");

}
