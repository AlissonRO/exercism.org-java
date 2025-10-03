import java.util.HashSet;
import java.util.Set;

class PangramChecker {

    static public boolean isPangram(String input) {

        Set<Character> alphabet = new HashSet<>();
        for(char c: input.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray()){
            alphabet.add(c);
        }
        return alphabet.size() == 26;
    }
}