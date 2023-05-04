package ee.vanessa.kodutoo10;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Visiit {
    private int id;
    private String ravi;
    private Klient omanik;
    private String loom;
}
