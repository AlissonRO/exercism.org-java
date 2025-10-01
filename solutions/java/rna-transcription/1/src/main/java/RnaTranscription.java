class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder rna = new StringBuilder();

        for(char c : dnaStrand.toCharArray()){
            rna.append(switch (c){
                case 'G'-> "C";
                case 'C' -> "G";
                case 'T' -> "A";
                case 'A' -> "U";
                default -> throw new IllegalArgumentException("Unexpected value: " + c);
            });
        }
      return rna.toString();
    }
}