import java.util.ArrayList;
public class AddRecipe implements Command{
    public AddRecipe(User user){
        execute(user);
    }

    private void execute(User user){
        Keyboard keyboard = new Keyboard();
        String recipe_name = keyboard.nextLine("Please enter the name of the recipe: ");
        String ingredient_name = "";
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ArrayList<Integer> ingredient_stock = new ArrayList<Integer>();
        while (!ingredient_name.toLowerCase().equals("quit")){
            ingredient_name = keyboard.nextLine("Please enter the name of the ingredient or type \"quit\": ");
            if (!ingredient_name.toLowerCase().equals("quit")){
                IngredientProcess.searchIngredientsByName(ingredient_name);
                int ingredient_id = keyboard.nextInt("Please select the ID of the ingredient you want to add: ");
                Ingredient ingredient = IngredientProcess.readIngredientById(ingredient_id);
                ingredients.add(ingredient);
                int stock = keyboard.nextInt("How many would you like to have in the recipe?: ");
                ingredient_stock.add(stock);
            }
        }

        String instructions = keyboard.nextLine("Please enter the instructions for the recipe: ");
        Recipe recipe = new Recipe(recipe_name, ingredients, ingredient_stock, instructions);
        user.addRecipe(recipe);
    }
}