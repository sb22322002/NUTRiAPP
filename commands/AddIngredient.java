import java.util.ArrayList;
public class AddIngredient implements Command{
    public AddIngredient(User user){
        execute(user);
    }

    private void execute(User user){
        Keyboard keyboard = new Keyboard();
        String ingredient_name = keyboard.nextLine("Please enter the name of the ingredient: ");
        IngredientProcess.searchIngredientsByName(ingredient_name);
        int ingredient_id = keyboard.nextInt("Please select the ID of the ingredient you want to add: ");
        Ingredient ingredient = IngredientProcess.readIngredientById(ingredient_id);
        int ingredient_stock = keyboard.nextInt("How many would you like to add?: ");
        ArrayList<Ingredient> user_ing = user.getIngredients();
        // add ingredients 
        for(int i = 0; i < user_ing.size(); i++){
            if (user_ing.get(i).name.equals(ingredient.name)){
                user_ing.get(i).addStock(ingredient_stock);
                return;
            }
        }
        ingredient.addStock(ingredient_stock);
        user.addIngredient(ingredient);
    }
}