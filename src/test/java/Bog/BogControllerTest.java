/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Bog;

import Bog.Model.Bibliotek;
import Bog.Model.Bog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class BogControllerTest {
    Bibliotek bib = new Bibliotek();
    Bog bog1,bog2,bog3,bog4,bog5;

    @Before
    public void setUp() throws Exception {
        bog1 = new Bog(200,"Bog 1", 1994);
        bog2 = new Bog(300,"Bog 2", 1940);
        bog3 = new Bog(200,"Bog 3", 1993);
        bog4 = new Bog(400,"Bog 4", 2006);
        bog5 = new Bog(500,"Bog 5", 1964);
    }

    @Test
    public void addSampleBooks() {
        Assert.assertTrue(bib.addBog(bog1));
        Assert.assertTrue(bib.addBog(bog2));
        Assert.assertFalse(bib.addBog(bog3));
        Assert.assertTrue(bib.addBog(bog4));
        Assert.assertTrue(bib.addBog(bog5));
    }
}