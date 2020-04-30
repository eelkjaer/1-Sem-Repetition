/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Sogning;

import org.junit.Test;
import static org.junit.Assert.*;

public class SogningTest {
    Sogning sog = new Sogning();

    @Test
    public void findStrengIArray() {
        String[] array = new String[]{"Hej","med","dig"};

    }

    @Test(expected = Exception.class)
    public void shouldFail() throws Exception {
        sog.findStrengIArray(null,null);
    }

}