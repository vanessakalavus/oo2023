package ee.vanessa.kodutoo10;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoomController {
    Loom loom = new Loom(1,"kitti","kass","russianBlue",true);
//    Loom loom = new Loom(2,"muki","koer","rottweiler",true);
//    Loom loom = new Loom(3,"kilbu","kilpkonn","keskaasiaKilpkonn",true);

    //näiteks kui on võetud kutsikas ning soovitakse nime vahetada, käies samal ajal samas kliinikus edasi
    @GetMapping("muuda-nime/{nimi}")
    public Loom muudaNime(@PathVariable String nimi){
        loom.setNimi(nimi);
        return loom;
    }
    @GetMapping("loom")
    public Loom saaLoom() {
        return loom;
    }

    @GetMapping("kustuta-loom")
    public String kustutaLoom() {
        loom = null;
        return "Edukalt kustutatud!";
    }

    @GetMapping("muuda-aktiivsust")
    public Loom muudaAktiivsust(){
        loom.setAktiivne(!loom.isAktiivne());
        return loom;
    }


}