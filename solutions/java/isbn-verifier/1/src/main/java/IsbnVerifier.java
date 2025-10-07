class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        
        stringToVerify = stringToVerify.toUpperCase().replaceAll("-", "");
        if(!stringToVerify.matches("\\d{9}[\\dXx]")) return false;

        int ISBN_10 = 0;
        for(int i = 0; i < 10; i++ ){

           ISBN_10 += ((stringToVerify.charAt(i) == 'X' || stringToVerify.charAt(i) == 'x') ? 10 : stringToVerify.charAt(i) - '0') * (10 - i);
        }
        
       return ISBN_10 % 11 == 0;
    }
}