package ee.vanessa.kodutoo10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loom {
    private int id;
    private String nimi;
    private String liik;
    private String toug;
    private boolean aktiivne;
}