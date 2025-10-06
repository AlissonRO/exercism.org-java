class Say {

    private static final String[] ONES = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] SCALE = {
        "", "thousand", "million", "billion"
    };

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L)
            throw new IllegalArgumentException();
        if (number == 0)
            return "zero";

        StringBuilder result = new StringBuilder();
        int scaleIndex = 0;

        while (number > 0) {
            int part = (int) (number % 1000);
            if (part != 0) {
                String chunk = convertBelowThousand(part);
                if (!SCALE[scaleIndex].isEmpty())
                    chunk += " " + SCALE[scaleIndex];
                result.insert(0, chunk + " ");
            }
            number /= 1000;
            scaleIndex++;
        }

        return result.toString().trim();
    }

    private String convertBelowThousand(int number) {
        StringBuilder sb = new StringBuilder();

        if (number >= 100) {
            sb.append(ONES[number / 100]).append(" hundred");
            number %= 100;
            if (number > 0) sb.append(" ");
        }

        if (number > 0) {
            if (number < 20) {
                sb.append(ONES[number]);
            } else {
                sb.append(TENS[number / 10]);
                if (number % 10 != 0)
                    sb.append("-").append(ONES[number % 10]);
            }
        }

        return sb.toString();
    }
}
