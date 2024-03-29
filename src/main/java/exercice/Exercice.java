package exercice;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        // La chaîne de caractères est divisée en mots à l'aide de l'espace comme
        // séparateur
        String[] words = str.split(" ");

        // Pour chaque mot
        for (String word : words) {
            // Pour chaque caractère du mot
            for (char c : word.toCharArray()) {
                // Pour chaque caractère dans la liste d'ordre
                for (Character ordreChar : ordre) {
                    // Si le caractère du mot est dans la liste d'ordre
                    if (c == ordreChar) {
                        // Récupère son indice dans la liste d'ordre
                        int index = ordre.indexOf(ordreChar);
                    }
                }
            }
        }

        // Le tableau de mots est trié en utilisant un comparateur personnalisé
        Arrays.sort(words, new Comparator<String>() {
            @Override
            // La méthode de comparaison pour le comparateur personnalisé est définie
            public int compare(String o1, String o2) {
                // Récupère la position de la première lettre de chaque mot dans la liste
                // 'ordre'
                int index1 = ordre.indexOf(o1.charAt(0));
                int index2 = ordre.indexOf(o2.charAt(0));

                // Si les deux lettres ne figurent pas dans 'ordre', elles sont considérées
                // comme égales
                if (index1 == -1 && index2 == -1)
                    return 0;
                // Si la première lettre figure dans 'ordre' et la deuxième non, la première est
                // placée en premier
                else if (index1 != -1 && index2 == -1)
                    return -1;
                // Si la première lettre ne figure pas dans 'ordre' et la deuxième si, la
                // deuxième est placée en premier
                else if (index1 == -1)
                    return 1;
                // Si les deux lettres figurent dans 'ordre', leur position dans 'ordre'
                // détermine leur ordre
                else
                    return Integer.compare(index1, index2);
            }
        });

        // Retourne la liste de mots triés
        return Arrays.asList(words);
    }

}
