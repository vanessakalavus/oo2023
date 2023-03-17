public class Toidukomponent {
    private double kogus;
    private Toiduaine toiduaine;

    public Toidukomponent(double kogus, Toiduaine toiduaine) {
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }

    public double getKogus() {
        return kogus;
    }

    public Toiduaine getToiduaine() {
        return toiduaine;
    }

    public double arvutaRasvakogus() {
        return (kogus / 100) * toiduaine.getRasvadeProtsent();
    }
}