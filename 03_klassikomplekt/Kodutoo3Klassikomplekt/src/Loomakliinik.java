class Loomakliinik {
    Loom loom;
    Omanik omanik;
// loomakliiniku konstruktor
    public Loomakliinik(Loom loom, Omanik omanik) {
        this.loom = loom;
        this.omanik = omanik;
    }
//kuvatakse looma info
    public void kuvaLoomaAndmed() {
        System.out.println("Looma nimi: " + loom.getNimi());
        System.out.println("Looma vanus: " + loom.getVanus());
        System.out.println("Looma liik: " + loom.getLiik());
    }
//Kuvatakse omaniku info
    public void kuvaOmanikuAndmed() {
        System.out.println("Omaniku nimi: " + omanik.getNimi());
        System.out.println("Omaniku telefon: " + omanik.getTelefon());
        System.out.println("Omaniku email: " + omanik.getEmail());
    }
}