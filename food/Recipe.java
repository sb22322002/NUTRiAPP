import java.util.ArrayList;
public class Recipe {
    String name;
    ArrayList<Ingredient> ingredients;
    ArrayList<Integer> ingredient_stock;
    String instructions;

    Recipe(){}

    Recipe(String name, ArrayList<Ingredient> ingredients, ArrayList<Integer> ingredient_stock, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.ingredient_stock = ingredient_stock;
        this.instructions = instructions; 
    }

    public String getName(){ return name; }
    public ArrayList<Ingredient> getIngredients(){ return ingredients; }
    public ArrayList<Integer> getIngredient_stock(){return ingredient_stock; }
    public String getInstructions(){ return instructions; }
}