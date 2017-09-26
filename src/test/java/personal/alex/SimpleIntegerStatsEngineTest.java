package personal.alex;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleIntegerStatsEngineTest {

    private SimpleIntegerStatsEngine statsEngine;

    @Before
    public void setUp() throws Exception {
        statsEngine = new SimpleIntegerStatsEngine();
    }

    /*
    public void calculateIntegerStats() {
        calculateTotalNumberOfIntegers(inputIntegers);
        calculateHighestNumberOfIntegersInOneLine(inputIntegers);
        calculateHighestNumberOfIntegersInOneLine(inputIntegers);
        calculateModeOfAllIntegers(inputIntegers);
    }
    */

    @Test
    public void testStatsCalculationWhereThereAreNoIntegers() {
        List<int[]> emptyDataSet = new ArrayList<int[]>();
        List<String> results;

        statsEngine.setIntegerData(emptyDataSet);
        statsEngine.calculateIntegerStats();
        results = statsEngine.getCalculatedIntegerStats();

        assertEquals(1, results.size());
        assertEquals("No integers to work with == no stats", results.get(0));
    }

    @After
    public void tearDown() throws Exception {
        statsEngine = null;
    }
}
