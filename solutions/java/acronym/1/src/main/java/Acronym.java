class Acronym {
    private final String acronym;

    Acronym(String phrase) {

        String cleaned = phrase.replaceAll("[^\\p{L}\\p{N}']+", " ");
        String[] word = cleaned.trim().split( "\\s+");

        StringBuilder phraseBuilder = new StringBuilder();

        for(String s : word){
            if(!s.isEmpty())phraseBuilder.append(s.charAt(0));
        }

        this.acronym = phraseBuilder.toString().toUpperCase();
    }

    String get() {
       return this.acronym;
    }
}