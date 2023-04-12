import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoomTest {
    private Kass kass;
    private Koer koer;

    @Before
    public void setUp() throws Exception {
        kass = new Kass(3, "Miisu", "pruun");
        koer = new Koer(5, "Pontu", "must");
    }

    @Test
    public void testKassiTutvustus() {
        String expected = "Mina olen Miisu ja olen 3 aastat vana. Olen ka kass ja minu karvavärv on pruun.";
        assertEquals(expected, kass.tutvusta());
    }

    @Test
    public void testKoeraTutvustus() {
        String expected = "Mina olen Pontu ja olen 5 aastat vana. Olen ka koer ja minu karvavärv on must.";
        assertEquals(expected, koer.tutvusta());
    }

    @Test
    public void testKassiHelid() {
        assertEquals("Mjäu!", kass.heli());
    }

    @Test
    public void testKoeraHelid() {
        assertEquals("Auh!", koer.heli());
    }

    @Test
    public void testKassiVanus() {
        assertEquals(3, kass.getVanus());
        kass.setVanus(4);
        assertEquals(4, kass.getVanus());
    }

    @Test
    public void testKoeraVanus() {
        assertEquals(5, koer.getVanus());
        koer.setVanus(6);
        assertEquals(6, koer.getVanus());
    }

    @Test
    public void testKassiNimi() {
        assertEquals("Miisu", kass.getNimi());
        kass.setNimi("Pisi");
        assertEquals("Pisi", kass.getNimi());
    }

    @Test
    public void testKoeraNimi() {
        assertEquals("Pontu", koer.getNimi());
        koer.setNimi("Karu");
        assertEquals("Karu", koer.getNimi());
    }
}


//    @Test
//    public void testHamstriTutvustus() {
//        String expected = "Mina olen Kiku ja olen 2 aastat vana. Olen ka hamster ja minu karvavärv on hall.";
//        assertEquals(expected, hamster.tutvusta());
//    }

//    @Test
//    public void testHamstriHelid() {
//        assertEquals("Kriisk!", hamster.heli());
//    }
//
//    @Test
//    public void testHamstriVanus() {
//        assertEquals(2, hamster.getVanus());
//        hamster.setVanus(3);
//        assertEquals(3, hamster.getVanus());
//    }
//
//    @Test
//    public void testHamstriNimi() {
//        assertEquals("Kiku", hamster.getNimi());
//        hamster.setNimi("Krõõt");
//        assertEquals("Krõõt", hamster.getNimi());
//    }

