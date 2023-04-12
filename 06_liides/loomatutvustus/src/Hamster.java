public class Hamster extends Neljajalgne {
    private String karvavarv;

    public Hamster(int vanus, String nimi, String karvavarv) {
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
        return "Kriisk!";
    }

    public String tutvusta() {
        return super.tutvusta() + " Olen ka hamster ja minu karvavärv on " + karvavarv + ".";
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