package ee.vanessa.pood;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pood {
//    @Id
//    private Long id;
    @Id
    private String nimetus;
    private int avamiseAeg;
    private int sulgemiseAeg;
    private int kylastajateArv;
}
