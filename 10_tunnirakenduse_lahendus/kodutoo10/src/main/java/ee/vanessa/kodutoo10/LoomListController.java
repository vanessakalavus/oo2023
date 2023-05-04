package ee.vanessa.kodutoo10;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoomListController {
    List<Loom> loomad;

    public LoomListController() {
        loomad = new ArrayList<>(Arrays.asList(
                new Loom(1,"Kitti", "kass","RussianBlue",true),
                new Loom(2,"muki", "koer","taks",true),
                new Loom(3,"piiksu", "hamster","euroopa lühikarvaline kääbushamster",true)));
    }

    @GetMapping("loomad")
    public List<Loom> saaLoomad() {
        return loomad;
    }
    @GetMapping("kustuta-loom/{index}")
    public String kustutaLoom(@PathVariable int index) {
        loomad.remove(index);
        return "Loom on registrist kustutatud!";
    }
    @GetMapping("lisa-loom/{id}/{nimi}/{hind}/{aktiivne}")
    public List<Loom> lisaLaev(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable String liik,
            @PathVariable String toug,
            @PathVariable boolean aktiivne) {
        loomad.add(new Loom(id, nimi, liik,toug, aktiivne));
        return loomad;
    }
}
