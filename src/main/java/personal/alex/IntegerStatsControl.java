package personal.alex;

/**
 * Integer statistics main class
 *  Alex W. 09/2017
 */

public class IntegerStatsControl
{
    private String inputFileName;
    private IntegerParser integerParser;

    public IntegerStatsControl(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            String errorNoFileNameArgument = "Error: No file was specified\n\n"
                    + "Usage: java {file location and name}\n"
                    + "\tExample: java C:\\myFolder\\myCSV.csv\n";
            System.out.println(errorNoFileNameArgument);
            System.exit(1);
        }
        else {
            IntegerStatsControl integerStatsControl = new IntegerStatsControl(args[0]);
            integerStatsControl.run();
        }
    }

    private void run() {
        setup();
        integerParser.parseIntegersFromCSVFile(inputFileName);
    }

    private void setup() {
        integerParser = new IntegerParser();
    }
}
