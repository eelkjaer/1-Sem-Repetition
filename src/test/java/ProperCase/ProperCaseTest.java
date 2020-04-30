/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package ProperCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import static org.junit.Assert.*;

public class ProperCaseTest {
    ProperCase prc = new ProperCase();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    @Order(1)
    public void shouldBeValid() {
        String expected = "HEJ";
        String actual = prc.ensureCasing("HEJ");

        assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    @Order(2)
    public void shouldThrowError() throws IllegalArgumentException{
        prc.ensureCasing(null);
    }
}