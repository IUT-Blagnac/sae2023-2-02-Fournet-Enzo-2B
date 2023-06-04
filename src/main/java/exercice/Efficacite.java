package exercice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Efficacite {
    public static List<String> solution(String str, List<Character> ordre) {
        Map<Character, List<String>> map = new LinkedHashMap<>();
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        if (str.length() == 0) return List.of("");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || c == '.' || c == ',' || c == '\'' || c == '\"' ||
                (c == '\'' && i > 0 && i < str.length() - 1 && Character.isLetter(str.charAt(i - 1)) && Character.isLetter(str.charAt(i + 1)))) {
                if (temp.length() > 0) {
                    map.computeIfAbsent(temp.charAt(0), k -> new ArrayList<>()).add(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(c);
            }
        }

        if (temp.length() > 0) {
            map.computeIfAbsent(temp.charAt(0), k -> new ArrayList<>()).add(temp.toString());
        }

        for (Character c : ordre) {
            List<String> words = map.remove(c);
            if (words != null) {
                result.addAll(words);
            }
        }

        for (List<String> words : map.values()) {
            result.addAll(words);
        }

        return result;
    }
}
