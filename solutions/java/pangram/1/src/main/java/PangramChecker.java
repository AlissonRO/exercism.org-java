import java.util.HashSet;
import java.util.Set;

class PangramChecker {

    static public boolean isPangram(String input) {
        String cleaned  = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Set<Character> alphabet = new HashSet<>();
        for(char c: cleaned.toCharArray()){
            alphabet.add(c);
        }
        return alphabet.size() == 26;
    }
}