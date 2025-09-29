import java.util.Arrays;
class ResistorColorDuo {
    
    private final String[] allColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

   int value(String[] colors) {
       
        if(colors == null) throw new IllegalArgumentException("Color cannot be null");
       
        String first = String.valueOf(Arrays.asList(this.allColors).indexOf(colors[0].toLowerCase()));
        String second = String.valueOf(Arrays.asList(this.allColors).indexOf(colors[1].toLowerCase()));
    
        return Integer.parseInt((first+second));
    }
}