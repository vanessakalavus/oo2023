import java.util.Date;
import java.util.List;

public class Tellimus {
    Date tegemiseAeg;

    String tellija;
    List<String> tooted;
    boolean makstud;

    public Tellimus(String tellija, List<String> tooted){
        this.tegemiseAeg = new Date();
        this.tooted = tooted;
        this.makstud = false;
    }

    public void muudaMakstuks() {
        this.makstud = true;
    }

    public String KasOnMakstud() {
        if (makstud) {
            return "Makstud!";
        }else{
            return "Maksmata!";
        }
    }




}
