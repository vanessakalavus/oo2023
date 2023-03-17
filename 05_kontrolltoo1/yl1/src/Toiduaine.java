public class Toiduaine {
    private String nimetus;
    private double valgud;
    private double rasvad;
    private double sysivesikud;

    public Toiduaine(String nimetus, double valgud, double rasvad, double sysivesikud) {
        double summa = valgud + rasvad + sysivesikud;
        if (summa > 100) {
            throw new IllegalArgumentException("Midagi läks valesti. Sisestatud komponentide protsent ei saa ületada 100%");
        }
        this.nimetus = nimetus;
        this.valgud = valgud;
        this.rasvad = rasvad;
        this.sysivesikud = sysivesikud;
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getValgud() {
        return valgud;
    }

    public double getRasvad() {
        return rasvad;
    }

    public double getSysivesikud() {
        return sysivesikud;
    }

    public double arvutaRasvad(double kogus) {
        return kogus * (rasvad / 100);
    }
}