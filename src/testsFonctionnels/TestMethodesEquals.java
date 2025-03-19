package testsFonctionnels;

import cartes.*;

public class TestMethodesEquals {

    public static void main(String[] args) {

        Borne borne1 = new Borne(25);
        Borne borne2 = new Borne(25);

        System.out.println(borne1.equals(borne2));


        Attaque feuRouge1 = new Attaque(Type.FEU);
        Attaque feuRouge2 = new Attaque(Type.FEU);


        System.out.println(feuRouge1.equals(feuRouge2));


        Attaque feuRouge = new Attaque(Type.FEU);
        Parade feuVert = new Parade(Type.FEU);

        System.out.println(feuRouge.equals(feuVert));
    }
}

