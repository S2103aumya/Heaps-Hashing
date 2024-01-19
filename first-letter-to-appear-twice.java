import java.util.HashMap;
import java.util.Map;

public class Main {
    public static char firstLetterAppearsTwice(String str) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            if (hm.get(ch) == 2) {
                return ch;
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String input = "abca";
        char result = firstLetterAppearsTwice(input);

        if (result != '$') {
            System.out.println("The first letter that appears twice is: " + result);
        } else {
            System.out.println("No letter appears twice in the given string.");
        }
    }
}

