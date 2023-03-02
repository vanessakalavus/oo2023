import java.util.Date;
//kliiniku kliendibaas
public class Klient {
        String eesnimi;
        String perenimi;
        String email;
        boolean onlemmikloom;
        String loom;
        String loomaNimi;
        Date viimaneKylastus;



        public Klient(String eesnimi,String perenimi,String email){
            this.eesnimi = eesnimi;
            this.perenimi = perenimi;
            this.email = email;
            this.onlemmikloom = true;
            this.loom = null;
            this.loomaNimi = null;
            this.viimaneKylastus = new Date();
        }
        //saab teha päringu, et kas kliendil on lemmikloom
        public void KasOnLemmikloom() {
            this.onlemmikloom = true;
        }

        public String OnLemmikloom() {
            if (onlemmikloom) {
                return "Kliendil on lemmikloom";
            }else{
                return "Sellel kliendil pole registreeritud lemmiklooma";
            }
        }
        //uut külastust saab updateda aiult siis kui kasutajal on lemmikloom olemas
        public String uusKylastus(){
            this.onlemmikloom = true;
            this.viimaneKylastus = new Date();
            return "Kasutaja viimane külastusaeg on uuendatud";
        }
    public void MuudalemmikloomaOmamist() {this.onlemmikloom = true;}


    }

