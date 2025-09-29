import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int constitution;

    public DnDCharacter(){
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.constitution = ability(rollDice());
    }

     int ability(List<Integer> scores) {
        List<Integer> mutableScores = new ArrayList<>(scores);
        mutableScores.sort(Collections.reverseOrder());

        return mutableScores.stream().limit(3).mapToInt(Integer::intValue).sum();
    }

    List<Integer> rollDice() {
        Random rand = new Random();
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(rand.nextInt(6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    int getStrength() {return strength;}
    int getDexterity() {return dexterity;}
    int getConstitution() {return  constitution;}
    int getIntelligence() {return intelligence;}
    int getWisdom() {return wisdom;}
    int getCharisma() {return charisma;}
}
