package personal.alex;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Contains code based on: https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

public class IntegerParser {
    private List<int[]> parsedIntegers;

    public IntegerParser() {

    }

    public void parseIntegersFromCSVFile(String csvFileLocation) {
        List<String[]> csvContents = null;

        if(hasCSVFileExtension(csvFileLocation)) {
            csvContents = extractCSVContents(csvFileLocation);
            parsedIntegers = convertcsvContentsToInt(csvContents);
        }
        else {
            //Error reporting here?
            System.out.println(csvFileLocation + " is not a valid csv file");
            parsedIntegers = new ArrayList<int[]>();
        }
    }

    public List<int[]> getParsedIntegers() {
        return parsedIntegers;
    }

    private boolean hasCSVFileExtension(String csvFileName) {
        String extension = csvFileName.substring(csvFileName.lastIndexOf('.') + 1).toLowerCase();
        return extension.equals("csv");
    }

    private ArrayList<String[]> extractCSVContents(String csvFileLocation) {
        ArrayList<String[]> csvContents = new ArrayList<String[]>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFileLocation));
            String[] line;
            while ((line = reader.readNext()) != null) {
                csvContents.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading from csv file.");
        } finally {
            try {
                if(reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing csv file.");
            }
        }
        return csvContents;
    }

    private List<int[]> convertcsvContentsToInt(List<String[]> contents) {
        ArrayList<int[]> contentsConvertedToIntegers = new ArrayList<int[]>();

        try {
            for (int i = 0; i < contents.size(); i++) {
                String[] contentsLine = contents.get(i);
                int[] contentsAsIntegers = new int[contentsLine.length];
                for (int j = 0; j < contentsLine.length; j++) {
                    contentsAsIntegers[j] = Integer.parseInt(contentsLine[j]);
                }
                contentsConvertedToIntegers.add(contentsAsIntegers);
            }
        } catch (NumberFormatException e) {
            System.out.println("CSV File contains invalid input");
            contentsConvertedToIntegers = new ArrayList<int[]>();
        }

        return contentsConvertedToIntegers;
    }
}
