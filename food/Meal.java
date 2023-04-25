import java.util.ArrayList;
public class Meal {
    String name;
    ArrayList<Recipe> recipes;
    
    Meal(){}
    
    Meal(String name, ArrayList<Recipe> recipes) {
        this.name = name;
        this.recipes = recipes;
    }

    public String getName(){ return name; }
    public ArrayList<Recipe> getRecipes(){ return recipes; }

}