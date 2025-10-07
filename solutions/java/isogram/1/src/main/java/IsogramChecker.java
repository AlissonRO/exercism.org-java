class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] phraseChar = phrase.toLowerCase().replaceAll("[\\s-]", "").toCharArray();

        for(int i = 0 ; i < phraseChar.length; i++){
            for(int j = 0; j < phraseChar.length; j++){
                if(phraseChar[i] == phraseChar[j] && i != j){
                    return false;
                }
            }
        }
        return true;
    }
}
