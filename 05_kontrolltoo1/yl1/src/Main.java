public class Main {
    public static void main(String[] args) {
        // loome mõned toiduained
        Toiduaine kartul = new Toiduaine("Kartul", 2.0, 0.1, 18.4);
        Toiduaine hapukoor = new Toiduaine("Hapukoor", 2.3, 20.0, 3.2);
        Toiduaine majonees = new Toiduaine("Majonees", 7.3, 25.0, 9.2);
        Toiduaine hapukurk = new Toiduaine("Hapukurk", 3.5, 2.0, 18.2);
        Toiduaine vorst = new Toiduaine("Vorst", 14.0, 25.0, 0.8);

        // loome mõned toidukomponendid
        Toidukomponent kartulikomponent = new Toidukomponent(200,kartul);
        Toidukomponent hapukoorkomponent = new Toidukomponent(300,hapukoor);
        Toidukomponent majoneeskomponent = new Toidukomponent(300,majonees);
        Toidukomponent hapukurkkomponent = new Toidukomponent(30,hapukurk);
        Toidukomponent vorstikomponent = new Toidukomponent(100, vorst);

        // arvutame toidukomponendi sees leiduva rasvakoguse
        double hapukooraRasvakogus = hapukoorkomponent.arvutaRasvakogus();
        System.out.println("Hapukoore rasvakogus: " + hapukooraRasvakogus + " g");

        double kartuliRasvakogus = kartulikomponent.arvutaRasvakogus();
        System.out.println("kartuli rasvakogus: " + hapukooraRasvakogus + " g");

        double vorstiRasvakogus = majoneeskomponent.arvutaRasvakogus();
        System.out.println("Majoneesi rasvakogus: " + vorstiRasvakogus+ " g");


        //loome uue toiduainete listi
        //ToiduaineteRegister register = new ToiduaineteRegister();

        // lisame toiduained
//        register.lisaToiduaine(kartul);
//        register.lisaToiduaine(hapukoor);
//        register.lisaToiduaine(vorst);

        // vaatame andmeid toiduainete nime järgi
//        System.out.println("Kartul: " + register.näitaToiduaineNimeJärgi("Kartul"));

        // otsime toiduaineid rasvaprotsendivahemiku järgi
//        List<Toiduaine> rasvasedToiduained = register.otsiToiduaineidRasvaprotsendiJärgi(15.0, 30.0);
//        System.out.println("Rasvased toiduained: " + rasvasedToiduained);

        //kustutame toiduaine
//        register.kustutaToiduaine("Kartul");

        // loome uue toidu
        Toidu salat = new Toidu("Kartulisalat");
        salat.lisaToidukomponent(kartulikomponent);
        salat.lisaToidukomponent(hapukoorkomponent);
        salat.lisaToidukomponent(majoneeskomponent);
        salat.lisaToidukomponent(hapukurkkomponent);
        salat.lisaToidukomponent(vorstikomponent);

        // küsime toidu valkude, rasvade ja süsivesikute kogust
        double valkudeKogus = salat.arvutaValkudeKogus();
        double rasvadeKogus = salat.arvutaRasvadeKogus();
        double süsivesikuteKogus = salat.arvutaSüsivesikuteKogus();
        System.out.println("Kartulisalati valgud: " + valkudeKogus);
        System.out.println("Kartulisalati rasvad: " + rasvadeKogus);
        System.out.println("Kartulisalati süsivesikud: " + süsivesikuteKogus);
    }
}

