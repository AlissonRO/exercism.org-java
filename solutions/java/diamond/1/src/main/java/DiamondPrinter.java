import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        int n = a - 'A';
        int width = 2 * n + 1; 

        for (int i = 0; i <= n; i++) {
            StringBuilder line = new StringBuilder();
            line.append(" ".repeat(n - i));       
            line.append((char) ('A' + i));        
            if (i > 0) line.append(" ".repeat(2 * i - 1)).append((char) ('A' + i)); 
            line.append(" ".repeat(width - line.length())); 
            diamond.add(line.toString());
        }

        for (int i = n - 1; i >= 0; i--) {
            diamond.add(diamond.get(i));
        }

        return diamond;
    }
}