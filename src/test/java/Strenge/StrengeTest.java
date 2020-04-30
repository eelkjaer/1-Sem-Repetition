package Strenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrengeTest {
    public Strenge str = new Strenge();

    @Test
    public void nyStreng() {
        str.nyStreng("Misse","fisk",'s','z');
    }

    @Test(expected = IllegalArgumentException.class)
    public void fejlStreng(){
        str.nyStreng(null,"fisk",'s','z');
    }
}