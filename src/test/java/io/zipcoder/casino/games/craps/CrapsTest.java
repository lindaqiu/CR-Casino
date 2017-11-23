package io.zipcoder.casino.games.craps;

import io.zipcoder.casino.nuts_n_bolts.Dice;
import org.junit.Assert;
import org.junit.Test;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class CrapsTest {



    @Test
    public void initialThrowTest(){

        Craps crapsGame = new Craps();
        int actual;
        actual = crapsGame.initialThrow();
        Assert.assertTrue(Math.abs(actual)<=1);
    }






}
