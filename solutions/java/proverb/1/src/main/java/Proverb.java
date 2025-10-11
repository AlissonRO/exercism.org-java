class Proverb {
    private final String[] words;
    private final String[] middle = {"For want of a ", " the ", " was lost.", "And all for the want of a "};

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";
        if (words.length == 1) return middle[3] + words[0] + ".";

        StringBuilder proverb = new StringBuilder();
        for (int i = 0; i < words.length -1; i++) {
            proverb.append(middle[0]).append(words[i])
            .append(middle[1]).append(words[i+1])
            .append(middle[2]).append("\n");
        }
        proverb.append(middle[3]).append(words[0]).append(".");
        return proverb.toString();
    }
}