
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return myCollection.stream().anyMatch(card -> !theirCollection.contains(card))
                && theirCollection.stream().anyMatch(card -> !myCollection.contains(card));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();
        if(!collections.isEmpty()){
            common.addAll(collections.get(0));
            collections.forEach(common::retainAll);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        collections.forEach(all::addAll);
        return all;
    }
}
