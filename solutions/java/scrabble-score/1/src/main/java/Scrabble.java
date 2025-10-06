class Scrabble {
    private int points = 0;
    
    Scrabble(String word) {
       for(char letter : word.toCharArray()){
           switch (Character.toUpperCase(letter)){
               case 'A', 'E' , 'I' , 'O' , 'U' , 'L' , 'N' , 'R', 'S' , 'T' -> this.points++;
               case 'D', 'G' -> this.points += 2;
               case 'B', 'C' , 'M' , 'P' -> this.points += 3;
               case 'F', 'H' , 'V' , 'W' , 'Y' -> this.points += 4;
               case 'K' -> this.points += 5;
               case 'J', 'X' -> this.points += 8;
               case 'Q', 'Z' -> this.points +=10;
           }
       }
    }

    int getScore() {
        return this.points;
    }
}
