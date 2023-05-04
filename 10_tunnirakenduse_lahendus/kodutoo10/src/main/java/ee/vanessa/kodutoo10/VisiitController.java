package ee.vanessa.kodutoo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.ToDoubleBiFunction;

@RestController
public class VisiitController {
    @Autowired
    LoomListController loomListController;
    @Autowired
    KlientController klientController;

    Klient omanik = new Klient(5, "pille", "kask",342534, new Date());
    List<Visiit> tellimused = new ArrayList<>(Collections.unmodifiableList(Arrays.asList(
            new Visiit(5, "punetus", omanik,)
    )));
    @GetMapping("tellimused")
    public List<Visiit> saaVisiidid() {
        return saaVisiidid();
    }

}
