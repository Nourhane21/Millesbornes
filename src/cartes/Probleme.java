package cartes;

public abstract class Probleme extends Carte {
    private Type type;

    protected Probleme(Type type) {
        super();
        this.type = type;
    }


    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probleme probleme = (Probleme) o;

        return type == probleme.type;
    }

    @Override
    public String toString() {
        return "Probleme{" +
                "type=" + type +
                '}';
    }
}
