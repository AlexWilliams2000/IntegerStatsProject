package personal.alex;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SimpleIntegerStatsEngineTest {

    private SimpleIntegerStatsEngine statsEngine;

    @Before
    public void setUp() throws Exception {
        statsEngine = new SimpleIntegerStatsEngine();
    }



    @After
    public void tearDown() throws Exception {
        statsEngine = null;
    }


}
