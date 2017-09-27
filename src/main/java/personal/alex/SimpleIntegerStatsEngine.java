package personal.alex;

import java.math.BigDecimal;
import java.util.*;

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

    private void calculateHighestNumberOfIntegersInOneLine(List<int[]> inputIntegers) {
        int highest = 0;
        for(int[] intArray : inputIntegers) {
            if(intArray.length > highest) highest = intArray.length;
        }
        calculatedIntegerStats.add("Highest number of integers in one line: " + highest);
    }

    private void calculateModeOfAllIntegers(List<int[]> inputIntegers) {
        LinkedHashMap<Integer, Integer> countOfUniqueIntegers = new LinkedHashMap<Integer, Integer>();
        int highestCount = 0;
        for(int[] intArray : inputIntegers) {
            for(int i = 0; i < intArray.length; i++) {
                if(countOfUniqueIntegers.containsKey(intArray[i])) {
                    int count = countOfUniqueIntegers.get(intArray[i]);
                    countOfUniqueIntegers.put(intArray[i], ++count);
                    if(count > highestCount) highestCount = count;
                }
                else {
                    countOfUniqueIntegers.put(intArray[i], 1);
                    if(1 > highestCount) highestCount = 1;
                }
            }
        }

        int modeCount = 0;
        for (Map.Entry<Integer, Integer> entry : countOfUniqueIntegers.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == highestCount) {
                calculatedIntegerStats.add("Mode of all integers " + ++modeCount + ": " + key);
            }
        }
    }
}
