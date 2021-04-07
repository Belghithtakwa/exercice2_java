public class IngredientCuire extends Ingredient{
    public int temp;
    public IngredientCuire(String nom,String etat, int quantite,String unite,int temper){
        super(nom,etat,quantite, unite);
          this.temp = temper;
    }
    public void cuire(){
        this.etat = "cuit";
    }

}
