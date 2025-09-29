import java.util.Arrays;

class ResistorColor {
    private final String[] allColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        if(color == null) throw new IllegalArgumentException("Color cannor be null");
        return Arrays.asList(this.allColors).indexOf(color.toLowerCase());
    }
    
    String[] colors() {
        return this.allColors;
    }
}
