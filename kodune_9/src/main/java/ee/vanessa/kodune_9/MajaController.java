package ee.vanessa.kodune_9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MajaController {
//    majade lisamine
    Maja maja = new Maja(123,"Eramaja","Tamme1",300000,2014);

    @GetMapping("auto")
    public Maja saaToode() {
        return maja;
    }

    @GetMapping("suurenda-hinda")
    public Maja suurendaHinda() {
        maja.setHind( maja.getHind()+1000);
        return maja;
    }
    @GetMapping("kustuta-maja")
    public Maja kustutaMaja() {
        maja = null;
        return maja;
    }
}