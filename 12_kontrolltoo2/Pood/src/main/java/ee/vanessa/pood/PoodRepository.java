package ee.vanessa.pood;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface PoodRepository extends JpaRepository<Pood,String> {

}
