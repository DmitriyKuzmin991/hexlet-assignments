package exercise;

import java.util.*;

// BEGIN
class App {
    public static boolean scrabble(String letter, String word) {
        var letters = letter.toCharArray();
        List<Character> list = new LinkedList<>();
        for (var elements : letters) {
            list.add(elements);
        }
        for (int i = 0; i < word.length(); i++) {
            if (list.contains(word.charAt(i))) {
                list.remove(word.charAt(i));
            } else {
                return false;
            }
        }
        return true;
      }
}
//END
