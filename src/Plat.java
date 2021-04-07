import java.util.ArrayList;

public class Plat {
    private String nom;
    private ArrayList<Ingredient> Ingredients = new ArrayList<Ingredient>();
    public Plat(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    public ArrayList <Ingredient> getIngredients(){
            return this.Ingredients;
    }
    public void ajouteIngredient(Ingredient ingred){
        this.Ingredients.add(ingred);
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        Plat plat = (Plat) o;
        return Ingredients.equals(plat.Ingredients);
    }


    public static void main(String[] args){
        Plat newPlat = new Plat("choucroute");
        newPlat.ajouteIngredient(new Ingredient("choucroute","cuite",500,"g"));
        newPlat.ajouteIngredient(new Ingredient("lard","cuite et entier",150,"g"));
        newPlat.ajouteIngredient(new Ingredient("saucisses","entiere et cuite",2,"cardinalite"));
    }
}
