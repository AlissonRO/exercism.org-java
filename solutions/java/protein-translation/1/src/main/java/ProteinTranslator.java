import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteins  = new ArrayList<>();

        if(rnaSequence.isEmpty()) return proteins;

        String cleanRna = rnaSequence.toUpperCase().replaceAll("[^a-zA-Z]", "");
        String[] codons = cleanRna.split("(?<=\\G.{3})");

        for(String codon : codons){
            switch (codon) {
                case "AUG" -> proteins.add("Methionine");
                case "UUU", "UUC" -> proteins.add("Phenylalanine");
                case "UUA", "UUG" -> proteins.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> proteins.add("Serine");
                case "UAU", "UAC" -> proteins.add("Tyrosine");
                case "UGU", "UGC" -> proteins.add("Cysteine");
                case "UGG" -> proteins.add("Tryptophan");
                case "UAA", "UAG", "UGA" -> { return proteins; }
                default -> throw new IllegalArgumentException("Invalid codon");
            }
        }
        return proteins;
    }
}