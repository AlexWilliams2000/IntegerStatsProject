package personal.alex;

import java.util.List;

public class SimpleIntegerStatsEngine implements IntegerStatsEngine {
    private List<int[]> inputIntegers;
    private List<String> calculatedIntegerStats;

    public void setIntegerData(List<int[]> inputIntegerData) {
        inputIntegers = inputIntegerData;
    }

    public List<String> getCalculatedIntegerStats() {
        return calculatedIntegerStats;
    }

    public void calculateIntegerStats() {
        calculateTotalNumberOfIntegers(inputIntegers);
        calculateHighestNumberOfIntegersInOneLine(inputIntegers);
        calculateHighestNumberOfIntegersInOneLine(inputIntegers);
        calculateModeOfAllIntegers(inputIntegers);
    }

    //Todo: Total number of integers
    private void calculateTotalNumberOfIntegers(List<int[]> inputIntegers) {

    }

    //Todo: Mean value of integers to 3dp
    private void calculateMeanofAllIntegers(List<int[]> inputIntegers) {

    }

    //Todo: Highest number of integers in a line
    private void calculateHighestNumberOfIntegersInOneLine(List<int[]> inputIntegers) {

    }

    //Todo: Mode
    private void calculateModeOfAllIntegers(List<int[]> inputIntegers) {

    }


}
