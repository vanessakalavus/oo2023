import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void kontrolli_kolmnurga_ymbermoot() {
        Kolmnurk kolmnurk = new Kolmnurk(3,6,7,8);
        assertEquals(21.099, kolmnurk.arvutaYmbermoot(), 0.1);
    }
}
