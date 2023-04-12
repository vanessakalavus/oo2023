public abstract class Neljajalgne implements Loom {
    private int vanus;
    private String nimi;

    public Neljajalgne(int vanus, String nimi) {
        this.vanus = vanus;
        this.nimi = nimi;
    }

    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public abstract String heli();

    public String tutvusta() {
        return "Mina olen " + nimi + " ja olen " + vanus + " aastat vana.";
    }
}
