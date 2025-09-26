class ReverseString {

    static String reverse(String inputString) {
        var newString = new StringBuilder(inputString);
        newString.reverse();

        return newString.toString();
    }
}
