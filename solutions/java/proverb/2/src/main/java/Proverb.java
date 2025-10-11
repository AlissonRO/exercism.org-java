class Proverb {

    private final String[] words;

    Proverb(String[] words) {
        this.words = words;
    }
    String recite() {

        StringBuilder proverb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                proverb.append(String.format("And all for the want of a %s.", words[0]));
            } else {
                proverb.append(String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]));
            }
        }
        return proverb.toString();
    }
}