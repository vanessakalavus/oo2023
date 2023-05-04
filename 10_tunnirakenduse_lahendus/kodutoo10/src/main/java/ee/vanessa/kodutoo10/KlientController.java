package ee.vanessa.kodutoo10;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class KlientController {
    List<Klient> kliendid;

    public void KlientController() {
        kliendid = new ArrayList<>(Arrays.asList(
                new Klient(1,"vanessa","kalavus", 3425352, new Date()),
                new Klient(2,"Mari","Tamm", 64932352, new Date()),
                new Klient(3,"Juhan","Tali", 78932352, new Date())
        ));
    }

    @GetMapping("kliendid")
    public List<Klient> saaKliendid() {
        return kliendid;
    }

    @DeleteMapping("kustuta-isik/{index}")
    public String kustutaLoom(@PathVariable int index) {
        kliendid.remove(index);
        return "Lemmikloom kustutatud!";
    }

    @PostMapping("lisa klient")
    public List<Klient> lisaKlientURLParameetritega(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam String telNumber,
            @RequestParam double liik) {
        boolean add = kliendid.add(new Klient());
        return kliendid;
    }

}