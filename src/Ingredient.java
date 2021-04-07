import java.util.Objects;

public class Ingredient {
    String nom_aliment, etat;
    int quantite;
    String unite;

    Ingredient(String n, String e, int q, String unite) {
        this.nom_aliment = n;
        this.etat = e;
        this.quantite = q;
        this.unite = unite;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        Ingredient that = (Ingredient) object;
        return Objects.equals(nom_aliment, that.nom_aliment) && Objects.equals(etat, that.etat);
    }
}

