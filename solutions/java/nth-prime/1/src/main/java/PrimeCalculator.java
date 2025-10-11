class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException();

        int numberNth = 0;
        int num = 1;

        while (true) {
            num++;
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) numberNth++;
            if (numberNth == nth) return num;
        }
    }
}