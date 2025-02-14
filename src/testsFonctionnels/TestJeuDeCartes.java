package testsFonctionnels;

import org.junit.jupiter.api.Test;
import cartes.*;

public class TestJeuDeCartes {

    @Test
    public void testAfficherJeuDeCartes() {
        JeuDeCartes jeu = new JeuDeCartes();
        jeu.afficherJeuDeCartes();
    }

}
