package exercise;

import java.util.List;
import java.util.LinkedList;

// BEGIN
class App {
    public static boolean scrabble(String letter, String word) {
        char[] letters = letter.toLowerCase().toCharArray();
        List<Character> list = new LinkedList<>();
        for (var elements : letters) {
            list.add(elements);
        }
        char[] originWord = word.toLowerCase().toCharArray();
        for (char symbol : originWord) {
            int indexCurrentElement = list.indexOf(symbol);
            if (indexCurrentElement < 0) {
                return false;
            } else list.remove(indexCurrentElement);
        }
        return true;
    }
}
//END
