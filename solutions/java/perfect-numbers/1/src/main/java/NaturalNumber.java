class NaturalNumber {
    private final int numberAliquot;

    NaturalNumber(int number) {
        if(number<=0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
            this.numberAliquot = number;
    }

    Classification getClassification() {
        int sum = 0;
        for (int i = 1; i < numberAliquot; i++) {
            if (numberAliquot % i == 0) {
                sum += i;
            }
        }
        return numberAliquot == sum ? Classification.PERFECT : numberAliquot < sum ? Classification.ABUNDANT : Classification.DEFICIENT;
    }
}