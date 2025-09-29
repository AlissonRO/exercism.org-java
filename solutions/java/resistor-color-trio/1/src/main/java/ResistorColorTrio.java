import java.util.Map;
class ResistorColorTrio {

    private final Map<String , Integer> colorMap = Map.of(
            "black",0,
            "brown",1,
            "red",2,
            "orange",3,
            "yellow",4,
            "green", 5,
            "blue",6,
            "violet", 7,
            "grey",8,
            "white",9);

    String label(String[] colors) {
        if(colors == null) throw new IllegalArgumentException("Color cannor be null");
        
        int first = colorMap.get(colors[0]);
        int second = colorMap.get(colors[1]);
        int mult = colorMap.get(colors[2]);

        long ohms = ((first * 10L) + second) * (long)Math.pow(10, mult);
        
        String[] units = {"ohms","kiloohms", "megaohms", "gigaohms"};
        int unitsIndex = 0;

        while (ohms >= 1000 && unitsIndex < units.length-1){
            ohms /=1000;
            unitsIndex++;
        }

        return ohms + " " + units[unitsIndex];
    }
}