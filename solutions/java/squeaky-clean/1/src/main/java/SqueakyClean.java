class SqueakyClean {
    static String clean(String identifier) {
        // Replace
        identifier = identifier.replace(' ','_')
                .replace('4', 'a')
                .replace('3','e')
                .replace('0','o')
                .replace('1', 'l')
                .replace('7','t');

        // camelCase / Omit characters
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {

            char c = identifier.charAt(i);
          

            if(c == '$' || c == '#' || c == '.' || c == '¡' || c == '!'){
                continue;
            }

            if (c == '-' && i + 1 < identifier.length()) {
                sb.append(Character.toUpperCase(identifier.charAt(++i)));
            } else if (c != '-') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}