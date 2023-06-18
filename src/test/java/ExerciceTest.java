import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import exercice.*;

import java.util.*;

public class ExerciceTest {
    // @Test
    // public void testSolution() {
    //     //Simplicité
    //         // Chaine simple avec ordre complet
    //         assertEquals(List.of("666","the", "the", "number", "of", "beast"), Simplicite.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine à 1 mot
    //         assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Simplicite.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
    //         // Chaine vide
    //         assertEquals(List.of(""), Simplicite.solution("",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine donnée en exemple
    //         assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Simplicite.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
    //         // Ajoutez vos test ici...


    //     //Efficacité
    //         // Chaine simple avec ordre complet
    //         assertEquals(List.of("666","the", "the", "number", "of", "beast"), Efficacite.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine à 1 mot
    //         assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Efficacite.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
    //         // Chaine vide
    //         assertEquals(List.of(""), Efficacite.solution("",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine donnée en exemple
    //         assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Efficacite.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
    //         // Ajoutez vos test ici...

    //     //Sobriété
    //         // Chaine simple avec ordre complet
    //         assertEquals(List.of("666","the", "the", "number", "of", "beast"), Sobriete.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine à 1 mot
    //         assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Sobriete.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
    //         // Chaine vide
    //         assertEquals(List.of(""), Sobriete.solution("",List.of('6', 't', 'n', 'o', 'b')));
    //         // Chaine donnée en exemple
    //         assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Sobriete.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
    //         // Ajoutez vos test ici...
    // }
    

    @Test
    public void testSolution() {
        //Simplicité
            // Chaine simple avec ordre complet
            assertEquals(List.of("666","the", "the", "number", "of", "beast"), Exercice.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
            // Chaine à 1 mot
            assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Exercice.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
            // Chaine vide
            assertEquals(true, List.of("").equals(Exercice.solution("",List.of('6', 't', 'n', 'o', 'b'))) || Collections.emptyList().equals(Exercice.solution("",List.of('6', 't', 'n', 'o', 'b'))));            // Chaine donnée en exemple
            assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Exercice.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
            // Ajoutez vos test ici...
    }
}