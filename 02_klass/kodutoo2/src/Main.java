import java.util.Date;

public class Main {

            public static void main(String[] args) {
                Klient vanessa = new Klient("vanessa","kalavus","vanessa");

                Klient vanessa2 = new Klient("vanessa","kalavus","vanessa");

                Klient vanessa3 = new Klient("vanessa","kalavus","vanessa");

               //viimase külastusaja registreerimine
                String sonum = vanessa2.uusKylastus();
                System.out.println(sonum);

                //saab kontrollida kas kasutqajal on lemmikloom
                vanessa2.OnLemmikloom();

                //Kliendile lemmilkooma lisamine andmebaasi
                vanessa.MuudalemmikloomaOmamist();

    }
}