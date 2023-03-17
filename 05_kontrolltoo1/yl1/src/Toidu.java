import java.util.ArrayList;
import java.util.List;

public class Toidu {
    private String nimetus;
    private List<Toidukomponent> toidukomponendid;

    public Toidu(String nimetus) {
        this.nimetus = nimetus;
        this.toidukomponendid = new ArrayList<>();
    }

    public void lisaToidukomponent(Toidukomponent toidukomponent) {
        toidukomponendid.add(toidukomponent);
    }

    public void eemaldaToidukomponent(Toidukomponent toidukomponent) {
        toidukomponendid.remove(toidukomponent);
    }

    public double arvutaValkudeKogus() {
        double valkudeKogus = 0;
        for (Toidukomponent toidukomponent : toidukomponendid) {
            valkudeKogus += (toidukomponent.getKogus() / 100) * toidukomponent.getToiduaine().getValkudeProtsent();
        }
        return valkudeKogus;
    }

    public double arvutaRasvadeKogus() {
        double rasvadeKogus = 0;
        for (Toidukomponent toidukomponent : toidukomponendid) {
            rasvadeKogus += (toidukomponent.getKogus() / 100) * toidukomponent.getToiduaine().getValkudeProtsent();
        }
        return rasvadeKogus;
    }
    public double arvutaSüsivesikuteKogus() {
        double valkudeKogus = 0;
        for (Toidukomponent toidukomponent : toidukomponendid) {
            valkudeKogus += (toidukomponent.getKogus() / 100) * toidukomponent.getToiduaine().getValkudeProtsent();
        }
        return valkudeKogus;
    }
}