package cartes;

public class JeuDeCartes {
    public JeuDeCartes(){
    }
private static Configuration[] typedeCartes = {
        new Configuration(10, new Borne(50)),
        new Configuration(6, new Parade(Type.CREVAISON)),
        new Configuration(1, new Botte(Type.ESSENCE)),
        new Configuration(10, new Borne(25)),
        new Configuration(6, new Parade(Type.ACCIDENT)),
        new Configuration(1, new Botte(Type.CREVAISON)),
        new Configuration(10, new Borne(75)),
        new Configuration(5, new Attaque(Type.FEU)),
        new Configuration(1, new Botte(Type.ACCIDENT)),
        new Configuration(12, new Borne(100)),
        new Configuration(4, new Attaque(Type.CREVAISON)),
        new Configuration(2, new Borne(400)),
        new Configuration(3, new Attaque(Type.ESSENCE)),
        new Configuration(14, new Parade(Type.FEU)),
        new Configuration(6, new FinLimite()),
};

public Configuration[] getTypedeCartes() {
    return typedeCartes;
}

public void afficherJeuDeCartes() {
    System.out.println("JEU :");
    for (Configuration config : typedeCartes) {
    	config.toString();
        //System.out.println(config);
    }



}
private static class Configuration {
    private int nbExemplaires;
    private Carte carte;

    private Configuration(int nbExemplaires, Carte carte) {
        this.nbExemplaires = nbExemplaires;
        this.carte = carte;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public Carte getCarte() {
        return carte;
    }

    @Override
    public String toString() {
        return "nb Exemplaires = "+ this.getNbExemplaires()+ "carte = "+ this.carte.toString();
    }

}
    public Carte[] donnerCartes(Configuration[] configurations) {
        // Calculer la taille totale du tableau (le nombre total de cartes)
        int totalCartes = 0;
        for (Configuration config : configurations) {
            totalCartes += config.getNbExemplaires();
        }

        // Créer le tableau de la taille calculée
        Carte[] toutesLesCartes = new Carte[totalCartes];

        // Remplir le tableau avec les cartes répliquées
        int index = 0;
        for (Configuration config : configurations) {
            Carte carte = config.getCarte();
            int nombreExemplaires = config.getNbExemplaires();

            for (int i = 0; i < nombreExemplaires; i++) {
                toutesLesCartes[index] = carte;
                index++;
            }
        }

        return toutesLesCartes;
    }
    private int count(Carte carte, Carte[] cartes){
        int nbCarte = 0;

        // Parcourir le tableau de cartes et compter les occurrences de la carte donnée
        for (Carte c : cartes) {
            if (c.equals(carte)) {
                nbCarte ++;
            }
        }

        return nbCarte;
    }
    public boolean checkCount() {
        Carte[] cartesDonnees = donnerCartes(typedeCartes);
        for (Configuration config : typedeCartes) {
            Carte carte = config.getCarte();
            int exemplaires1 = config.getNbExemplaires();
            int exemplaires2 = count(carte, cartesDonnees);

            if (exemplaires1 != exemplaires2) {
                return false;
            }
        }
        return true;
    }

}



