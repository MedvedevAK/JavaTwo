import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneDirectory {
    private Map<String, HashSet<String>> map;

    TelephoneDirectory() {
        this.map = new HashMap<>();
    }

    void add(String name, String phoneNumber) {
        HashSet<String> numbers;

        if (map.containsKey(name)) {
            numbers = map.get(name);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        map.put(name, numbers);
    }

    Set<String> get(String name) {
        return map.get(name);
    }
}