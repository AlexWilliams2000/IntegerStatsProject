package personal.alex;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class SimpleIntegerStatsEngine implements IntegerStatsEngine {
    private List<int[]> inputIntegers;
    private List<String> calculatedIntegerStats;
    private int totalNumberOfIntegers = 0;

    public SimpleIntegerStatsEngine() {
        this.calculatedIntegerStats = new LinkedList<String>();
    }

    public void setIntegerData(List<int[]> inputIntegerData) {
        inputIntegers = inputIntegerData;
    }

    public List<String> getCalculatedIntegerStats() {
        return calculatedIntegerStats;
    }

    public void calculateIntegerStats() {
        if(inputIntegers.size() == 0) {
            calculatedIntegerStats.add("No integers to work with == no stats");
        }
        else {
            calculateTotalNumberOfIntegers(inputIntegers);
            calculateMeanOfAllIntegers(inputIntegers);
            calculateHighestNumberOfIntegersInOneLine(inputIntegers);
            calculateModeOfAllIntegers(inputIntegers);
        }
    }

    private void calculateTotalNumberOfIntegers(List<int[]> inputIntegers) {
        for(int[] intArray : inputIntegers) {
            for(int i = 0; i < intArray.length; i++) {
                totalNumberOfIntegers++;
            }
        }
        //Can you autocast an int to string like this...?
        calculatedIntegerStats.add("Total number of integers: " + totalNumberOfIntegers);
    }

    //Todo: Mean value of integers to 3dp
    private void calculateMeanOfAllIntegers(List<int[]> inputIntegers) {
        int sum = 0;
        for(int[] intArray : inputIntegers) {
            for(int i = 0; i < intArray.length; i++) {
                sum+=intArray[i];
            }
        }

        BigDecimal sumBD = new BigDecimal(sum);
        BigDecimal countBD = new BigDecimal(totalNumberOfIntegers);
        BigDecimal mean = sumBD.divide(countBD,3, BigDecimal.ROUND_HALF_EVEN);

        calculatedIntegerStats.add("Mean of all integers to 3dp: " + mean.toString());
    }

    //Todo: Highest number of integers in a line
    private void calculateHighestNumberOfIntegersInOneLine(List<int[]> inputIntegers) {
        calculatedIntegerStats.add("Highest number of integers in one line: 4");
    }

    //Todo: Mode
    private void calculateModeOfAllIntegers(List<int[]> inputIntegers) {
        calculatedIntegerStats.add("Mode of all integers 1: 1");
        calculatedIntegerStats.add("Mode of all integers 2: 2");
    }
}
