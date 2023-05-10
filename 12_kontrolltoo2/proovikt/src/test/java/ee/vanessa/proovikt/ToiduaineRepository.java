package ee.vanessa.proovikt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToiduaineRepository extends JpaRepository<Toiduaine,Long> {
    Toiduaine findByNimetus(String nimetus);

    List<Toiduaine> findByRasvIsBetween(int alg, int l6pp);
}