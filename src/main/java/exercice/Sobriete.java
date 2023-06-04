package exercice;

import java.util.*;

public class Sobriete {
    public static List<String> solution(String str, List<Character> ordre) {

        if (str.length() == 0) return List.of("");

        String[] mots = str.split("[ .,'\"]+");
        Map<Character, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String mot : mots) {
            if (mot.length() == 0) continue;
            Character lettre = mot.charAt(0);
            if (!map.containsKey(lettre)) {
                map.put(lettre, new ArrayList<>());
            }
            map.get(lettre).add(mot);
        }

        for (Character lettre : ordre) {
            List<String> temp = map.get(lettre);
            if (temp != null) {
                result.addAll(temp);
                temp.clear();
            }
        }

        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                result.addAll(entry.getValue());
            }
        }

        return result;
    }
}
