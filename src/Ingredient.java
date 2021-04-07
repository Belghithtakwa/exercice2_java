import java.util.Objects;

public class Ingredient {
    String nom_aliment, etat;
    int quantite;
    String unite;

    Ingredient(String n ,String e, int q,String unite){
        this.nom_aliment = n;
        this.etat = e;
        this.quantite = q;
        this.unite= unite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Ingredient that = (Ingredient) o;
        return Objects.equals(nom_aliment, that.nom_aliment) && Objects.equals(etat, that.etat);
    }
}

