class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");
        if (!candidate.matches("\\d+") || candidate.length() <= 1) return false;

        int sum = 0;
        for (int i = candidate.length() - 1, doubleDigit = 0; i >= 0; i--, doubleDigit = 1 - doubleDigit) {
            int digit = candidate.charAt(i) - '0';
            if (doubleDigit == 1) digit = digit * 2 > 9 ? digit * 2 - 9 : digit * 2;
            sum += digit;
        }
        return sum % 10 == 0;
    }
}
