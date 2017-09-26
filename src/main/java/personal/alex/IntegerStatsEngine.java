package personal.alex;

import java.util.List;

public interface IntegerStatsEngine {
    public void setIntegerData(List<int[]> inputIntegerData);
    public List<String> getCalculatedIntegerStats();
    public void calculateIntegerStats();
}
