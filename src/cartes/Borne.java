package cartes;
import java.util.Objects;

public class Borne extends Carte {

    private int km;

    public Borne(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }


    @Override
    public String toString() {
        return "Borne [Km=" + km + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Borne borne = (Borne) o;
        return km == borne.km;
    }

    @Override
    public int hashCode() {
        return Objects.hash(km);
    }
}

