package personal.alex;

import java.util.List;

public class SimpleIntegerStatsEngine implements IntegerStatsEngine {
    private List<int[]> inputIntegers;
    private List<String> calculatedIntegerStats;

    //Todo: Total number of integers
    //Todo: Mean value of integers to 3dp
    //Todo: Highest number of integers in a line
    //Todo: Mode

    public void setIntegerData(List<int[]> inputIntegerData) {
        inputIntegers = inputIntegerData;
    }

    public List<String> getCalculatedIntegerStats() {
        return calculatedIntegerStats;
    }

    public void calculateIntegerStats() {

    }
}
