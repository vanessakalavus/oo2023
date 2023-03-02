import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Kasutaja vanessa = new Kasutaja("vanessa","kalavus","vanessa","vanessa","kalavus");

       Kasutaja vanessa2 = new Kasutaja("vanessa","kalavus","vanessa","vanessa","kalavus");

       Kasutaja vanessa3 = new Kasutaja("vanessa","kalavus","vanessa","vanessa","kalavus");

       String sonum = vanessa.kustutaKasutaja();
        System.out.println(sonum);

        vanessa3.muudaParool("vanessavanessa");

        Tellimus tellimus1 = new Tellimus("vanessa", Arrays.asList("Coca", "Fanta"));

        Tellimus tellimus2 = new Tellimus("vanessa", Arrays.asList("Coca", "Fanta"));

        Tellimus tellimus3 = new Tellimus("vanessa", Arrays.asList("Coca", "Fanta"));

        tellimus1.muudaMakstuks();
        tellimus2.KasOnMakstud();

    }
}