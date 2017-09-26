package personal.alex;

public class IntegerStatsEngineFactory {
    public static IntegerStatsEngine getIntegerStatsEngine(String engineType) {
        if(engineType.equals("SimpleIntegerStatsEngine")) {
            return new SimpleIntegerStatsEngine();
        }

        return null;
    }
}
