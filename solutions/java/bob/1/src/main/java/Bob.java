class Bob {
    String hey(String input) {
        input = input.trim();
        if (input.isEmpty()) return "Fine. Be that way!";

        boolean question = input.endsWith("?");
        boolean yell = input.equals(input.toUpperCase()) && input.matches(".*[A-Z].*");

        return yell && question ? "Calm down, I know what I'm doing!"
            : yell ? "Whoa, chill out!"
            : question ? "Sure."
            : "Whatever.";
    }
}