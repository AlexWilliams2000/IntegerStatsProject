package personal.alex;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntegerParserTest {
    private IntegerParser integerParser;

    @Before
    public void setUp() throws Exception {
        integerParser = new IntegerParser();
    }

    @Test
    public void testValidCSVInput() {
        List<int[]> testList = new ArrayList<int[]>();
        List<int[]> parsedIntegers = null;

        integerParser.parseIntegersFromCSVFile("src\\test\\resources\\SampleCSVvalidWithIntegers.csv");
        parsedIntegers = integerParser.getParsedIntegers();

        testList.add(new int[]{1,2,3,4,5});
        testList.add(new int[]{1,2,3,4,5,6});
        testList.add(new int[]{1,2,3,4,5,6,7});
        testList.add(new int[]{1,2,3,4,5,6,7,8});
        testList.add(new int[]{1,2,3,4,5,6,7,8,9});

        for(int i = 0; i < parsedIntegers.size(); i++) {
            assertArrayEquals(parsedIntegers.get(i), testList.get(i));
        }
    }

    @Test
    public void testValidCSVInputQuotedIntegers() {
        List<int[]> testList = new ArrayList<int[]>();
        List<int[]> parsedIntegers = null;

        integerParser.parseIntegersFromCSVFile("src\\test\\resources\\SampleCSVMixedTextIntegersAndIntegers.csv");
        parsedIntegers = integerParser.getParsedIntegers();

        testList.add(new int[]{1,2,3,4,5});
        testList.add(new int[]{1,2,3,4,5,6});
        testList.add(new int[]{1,2,3,4,5,6,7});
        testList.add(new int[]{1,2,3,4,5,6,7,8});
        testList.add(new int[]{1,2,3,4,5,6,7,8,9});

        for(int i = 0; i < parsedIntegers.size(); i++) {
            assertArrayEquals(parsedIntegers.get(i), testList.get(i));
        }
    }

    @Test
    public void testInvalidCSVInput() {
        List<int[]> parsedIntegers = null;

        integerParser.parseIntegersFromCSVFile("src\\test\\resources\\SampleCSVwithTextFields.csv");
        parsedIntegers = integerParser.getParsedIntegers();

        assertEquals(0, parsedIntegers.size());
    }

    @After
    public void tearDown() throws Exception {
        integerParser = null;
    }

}
