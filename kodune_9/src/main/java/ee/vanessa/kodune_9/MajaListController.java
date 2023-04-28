package ee.vanessa.kodune_9;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class MajaListController {
    List<Maja> majad = new ArrayList<>(Arrays.asList(
            new Maja(12,"Korter","leppa1",120000,1999),
            new Maja(12,"Paarismaja","kastani3",200000,2007),
            new Maja(12,"Ridaelamu","kuusiku8",180000,2015),
            new Maja(12,"eramaja","vahtra4",320000,2020);

    @GetMapping("majad")
    public List<Maja> saaMajad(List<Maja> Majad) {
        return Majad;
    }


    @PatchMapping("hind-dollaritesse/{kurss}")
    public List<Maja> hindDollaritesse(@PathVariable double kurss) {
        for (Maja toode : majad) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return majad;
    }
    @DeleteMapping("kustuta-maja/{index}")
    public List<Maja> kustutaMaja(@PathVariable int index) {
        majad.remove(index);
        return majad;
    }
}
