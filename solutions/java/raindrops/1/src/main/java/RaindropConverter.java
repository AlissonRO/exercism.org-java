class RaindropConverter {

    String convert(int number) {
        String rain = (number % 3 == 0 ? "Pling": "") +(number % 5 == 0 ? "Plang": "") +(number % 7 == 0 ? "Plong": "");
        return rain.isEmpty() ? String.valueOf(number) : rain;
    }
}
