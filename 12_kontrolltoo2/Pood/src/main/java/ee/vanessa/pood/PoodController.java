package ee.vanessa.pood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PoodController {
    @Autowired
    PoodRepository poodRepository;

    @GetMapping("saa-poed")
    public List<Pood> saaPoed() { return poodRepository.findAll();}

    //localhost:8080/lisa-pood?nimetus=Gross&avamiseAeg=9&sulgemiseAeg=22&kylastajateArv=0
    @PostMapping("lisa-pood")
    public List<Pood> lisaPood(
//            @RequestParam Long id,
            @RequestParam String nimetus,
            @RequestParam int avamiseAeg,
            @RequestParam int sulgemiseAeg,
            @RequestParam int kylastajateArv) {
        poodRepository.save(new Pood(nimetus, avamiseAeg,sulgemiseAeg,kylastajateArv));
        return poodRepository.findAll();
    }
    //localhost:8080/kas-on-avatud?nimetus=Gross&kell=9
    @GetMapping("kas-on-avatud")
    public String kasOnAvatud(
            @RequestParam String nimetus,
            @RequestParam int kell) {
        Pood pood = poodRepository.findById(nimetus).get();
        int avatud = pood.getAvamiseAeg();
        int suletud = pood.getSulgemiseAeg();

        if(kell >= avatud && kell < suletud){
            return "pood on avatud";
        } else {
            return "pood on suletud";
        }
    }
    //localhost:8080/lisa-kylastaja?nimetus=Gross
    @PostMapping("lisa-kylastaja")
    public String lisaKylastaja(
            @RequestParam String nimetus){
        Pood pood = poodRepository.findById(nimetus).get();
        int kylastaja = pood.getKylastajateArv() + 1;
        pood.setKylastajateArv(kylastaja);
        poodRepository.save(pood);
        return "Külastaja on edukalt lisatud. Hetkel on poes külastajaid: " +kylastaja;

    }
}