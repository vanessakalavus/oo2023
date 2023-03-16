class Loom {
    String nimi;
    int vanus;
    String liik;

    //looma konstruktor
    public Loom(String nimi, int vanus, String liik) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.liik = liik;
    }

    //looma funktsioonid
    public String getNimi() {
        return nimi;
    }

    public int getVanus() {
        return vanus;
    }

    public String getLiik() {
        return liik;
    }
}