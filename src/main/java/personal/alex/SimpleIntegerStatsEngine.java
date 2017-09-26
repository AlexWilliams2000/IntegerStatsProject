package personal.alex;

import java.util.LinkedList;
import java.util.List;

public class SimpleIntegerStatsEngine implements IntegerStatsEngine {
    private List<int[]> inputIntegers;
    private List<String> calculatedIntegerStats;

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
            calculateHighestNumberOfIntegersInOneLine(inputIntegers);
            calculateHighestNumberOfIntegersInOneLine(inputIntegers);
            calculateModeOfAllIntegers(inputIntegers);
        }
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
