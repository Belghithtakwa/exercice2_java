public class IngredientDecouper extends Ingredient{
   public IngredientDecouper(String nom,String etat, int quantite,String unite){
       super(nom,etat,quantite, unite);
   }

   public void decouper(){
       this.etat = "decouper";
   }
}