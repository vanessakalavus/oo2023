package ee.vanessa.kodutoo10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Klient {
    private int id;
    private String eesnimi;
    private String perenimi;
    private int telNumber;
    private Date liitumisaegAeg;
}
