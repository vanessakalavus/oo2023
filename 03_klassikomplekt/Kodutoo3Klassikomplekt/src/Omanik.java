class Omanik {
    String nimi;
    String telefon;
    String email;

    //konstruktor
    public Omanik(String nimi, String telefon, String email) {
        this.nimi = nimi;
        this.telefon = telefon;
        this.email = email;
    }

    // omaniku funktsioonid

    public String getNimi() {
        return nimi;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }
}
