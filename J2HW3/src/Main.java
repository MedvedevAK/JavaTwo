import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] wordsCollection = {"Packmaster", "wolf", "flying-squirrel", "wolf", "goal", "aim", "purpose", "target", "goal", "ammo", "aim", "leadership","hedgehog"};
        Map<String, Integer> map = new HashMap<>();

        for (String word : wordsCollection) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);

        Set<String> exclusiveWords = new HashSet<>(Arrays.asList(wordsCollection));
        System.out.println(exclusiveWords);


        TelephoneDirectory contact = new TelephoneDirectory();

        contact.add("Johan", "36689870799");
        contact.add("Smith", "31889890908");
        contact.add("Johan", "38896855980");
        contact.add("Marry", "39988668580");

        System.out.println(contact.get("Johan"));
        System.out.println(contact.get("Marry"));

    }
}