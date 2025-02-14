package cartes;

public enum Type {
    ESSENCE("panne d'essence", "Essence", "Citerne"),
    CREVAISON("Crevaison", "Roue de secours", "Increvable"),
    ACCIDENT("Accident","R�paration", "As du volant") ,
    FEU("Feu rouge", "Feu vert", "Vehicule prioritaire");

private final String attaque;
private final String parade;
private final String botte;

private Type(String attaque, String parade, String botte) {
    this.attaque = attaque;
    this.parade = parade;
    this.botte = botte;
}
public String getAttaque() {
    return attaque;
}
public String getParade() {
    return parade;
}
public String getBotte() {
    return botte;
}


}



