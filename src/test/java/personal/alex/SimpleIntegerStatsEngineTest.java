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

    @Test
    public void testStatsCalculationWhereThereAreIntegers() {
        List<String> results;
        List<int[]> dataSet = new ArrayList<int[]>();
        int[] line1 = new int[]{1,2};
        int[] line2 = new int[]{1,2,3};
        int[] line3 = new int[]{1,2,3,4};
        dataSet.add(line1);
        dataSet.add(line2);
        dataSet.add(line3);

        statsEngine.setIntegerData(dataSet);
        statsEngine.calculateIntegerStats();
        results = statsEngine.getCalculatedIntegerStats();

        assertEquals(5, results.size());
        assertEquals("Total number of integers: 9", results.get(0));
        assertEquals("Mean to 3dp: 2.111", results.get(1));
        assertEquals("Highest number of integers in one line: 4", results.get(2));
        assertEquals("Mode 1: 1", results.get(3));
        assertEquals("Mode 2: 2", results.get(4));
    }

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
