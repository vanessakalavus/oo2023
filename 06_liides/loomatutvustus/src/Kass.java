public class Kass extends Neljajalgne {
    private String karvavarv;

    public Kass(int vanus, String nimi, String karvavarv) {
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
        return "Mjäu!";
    }

    public String tutvusta() {
        return super.tutvusta() + " Olen ka kass ja minu karvavärv on " + karvavarv + ".";
    }

//    @Override
//    public Kass getKass() {
//        return null;
//    }

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
