import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KindergartenGarden {

    private final String gardenUp;
    private final String gardenDown;

    private static final List<String> STUDENTS = Arrays.asList(
        "Alice", "Bob", "Charlie", "David", "Eve", "Fred",
        "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"
    );

    KindergartenGarden(String garden) {
        String[] lines = garden.split("\n");
        gardenUp = lines[0];
        gardenDown = lines[1];
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();
        int index = STUDENTS.indexOf(student) * 2;

        plants.add(Plant.getPlant(gardenUp.charAt(index)));
        plants.add(Plant.getPlant(gardenUp.charAt(index + 1)));

        plants.add(Plant.getPlant(gardenDown.charAt(index)));
        plants.add(Plant.getPlant(gardenDown.charAt(index + 1)));

        return plants;
    }
}