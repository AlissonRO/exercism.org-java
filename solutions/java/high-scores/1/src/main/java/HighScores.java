import java.util.Collections;
import java.util.List;

class HighScores {
    List<Integer> scores;

    public HighScores(List<Integer> highScores) {this.scores = highScores;}

    List<Integer> scores() {return this.scores;}

    Integer latest() {return this.scores.getLast();}

    Integer personalBest() {return Collections.max(this.scores);}

    List<Integer> personalTopThree() {
        return this.scores.stream().sorted(Collections.reverseOrder()).limit(3).toList();
    }

}
 