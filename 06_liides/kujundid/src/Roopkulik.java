public class Roopkulik extends Tasapinnaline implements Arvutused {
    double kylg1;
    double kylg2;
    double kylg3;
    double kylg4;

    public Roopkulik(int tippudeArv, double kylg1, double kylg2, double kylg3, double kylg4) {
        super(tippudeArv);
        this.kylg1 = kylg1;
        this.kylg2 = kylg2;
        this.kylg3 = kylg3;
        this.kylg4 = kylg4;
    }

    @Override
    public double arvutaYmbermoot() {
        return 0;
    }

    @Override
    public double arvutaPindala() {
        return 0;
    }
}