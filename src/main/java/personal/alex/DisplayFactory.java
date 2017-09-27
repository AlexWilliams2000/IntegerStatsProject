package personal.alex;

public class DisplayFactory {
    public static Display getDisplay(String displayType) {
        if(displayType.equals("SimpleDisplay")) {
            return new SimpleDisplay();
        }

        return null;
    }
}
