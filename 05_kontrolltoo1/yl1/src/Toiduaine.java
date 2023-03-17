public class Toiduaine {
    private String nimetus;
    private double valkudeProtsent;
    private double rasvadeProtsent;
    private double sysivesikuteProtsent;

    public Toiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent) {
        if (valkudeProtsent + rasvadeProtsent + sysivesikuteProtsent > 100) {
            throw new IllegalArgumentException("Protsent kokku ei saa ületada 100!");
        }
        this.nimetus = nimetus;
        this.valkudeProtsent = valkudeProtsent;
        this.rasvadeProtsent = rasvadeProtsent;
        this.sysivesikuteProtsent = sysivesikuteProtsent;
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getValkudeProtsent() {
        return valkudeProtsent;
    }

    public double getRasvadeProtsent() {
        return rasvadeProtsent;
    }

    public double getSysivesikuteProtsent() {
        return sysivesikuteProtsent;
    }
}