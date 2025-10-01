class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        
         // int sum = input * (input + 1) / 2;
         // return sum * sum;
        
        int sum = 0;
        for(int i = 1; i <= input; i++){
            sum += i;
        }
        return (int)Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {

        // return input * (input + 1) * (2 * input + 1) / 6;

        int sum = 0;
        for(int i = 1; i <= input; i++){
            sum += (int)Math.pow(i, 2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}