package cartes;

public abstract class Bataille extends Probleme  {
    public Bataille(Type type) {
        super(type);
        // TODO Auto-generated constructor stub
    }


    @Override
    public String toString() {
        return "Bataille [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}
