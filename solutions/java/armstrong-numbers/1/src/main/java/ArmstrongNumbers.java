class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberString = String.valueOf(numberToCheck);
        int size = numberString.length();
        int result = 0;

        for(char c : numberString.toCharArray()){
           int digit = c - '0';
           result += (int) Math.pow(digit, size);
        }

        return result == numberToCheck;
    }

}