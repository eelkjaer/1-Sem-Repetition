/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Grass;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TidTilKlipningTest {
    TidTilKlipning ttk = new TidTilKlipning();

    @Test
    public void beregnMaksDage() {
        double expected = 1.25;
        double actual = ttk.dageTilSlaaning(3.5,5.0);

        assertEquals(expected,actual,0.1);
    }
}