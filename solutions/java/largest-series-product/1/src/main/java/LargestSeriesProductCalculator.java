class LargestSeriesProductCalculator {
    private final String seriesProduct;

    LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.chars().allMatch(Character::isDigit))
            throw new IllegalArgumentException("String to search may only contain digits.");
        this.seriesProduct = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits > seriesProduct.length())
            throw new IllegalArgumentException(
                "Series length must be less than or equal to the length of the string to search.");
        if (seriesProduct.isEmpty() && numberOfDigits != 0)
            throw new IllegalArgumentException(
                "Series length must be less than or equal to the length of the string to search.");

        long maxProduct = 0;

        for (int i = 0; i <= seriesProduct.length() - numberOfDigits; i++) {
            long product = 1;
            for (int j = 0; j < numberOfDigits; j++) {
                product *= seriesProduct.charAt(i + j) - '0';
            }
            if (product > maxProduct) maxProduct = product;
        }

        return maxProduct;
    }
}
