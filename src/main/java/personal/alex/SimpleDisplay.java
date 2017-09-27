package personal.alex;

import java.util.List;

public class SimpleDisplay implements Display {

    static final String header = "Calculated Integer Stats:\n\n";

    public SimpleDisplay() {

    }

    public void display(List<String> infoToDisplay) {
        System.out.println(header);
        for(String line : infoToDisplay) {
            System.out.println(line);
        }
    }
}
