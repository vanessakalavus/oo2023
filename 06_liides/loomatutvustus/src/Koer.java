public class Koer extends Neljajalgne {
    private String karvavarv;

    public Koer(int vanus, String nimi, String karvavarv) {
        super(vanus, nimi);
        this.karvavarv = karvavarv;
    }

    public String getKarvavarv() {
        return karvavarv;
    }

    public void setKarvavarv(String karvavarv) {
        this.karvavarv = karvavarv;
    }

    public String heli() {
        return "Auh!";
    }

    public String tutvusta() {
        return super.tutvusta() + " Olen ka koer ja minu karvavärv on " + karvavarv + ".";
    }

    @Override
    public Kass getKass() {
        return null;
    }

    @Override
    public void looKass() {

    }

    @Override
    public void mängi() {

    }

    @Override
    public void kassiHeli() {

    }
}