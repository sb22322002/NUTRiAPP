import java.util.ArrayList;
public class AddMeal implements Command{
    public AddMeal(User user){
        execute(user);
    }

    private void execute(User user){
        Keyboard keyboard = new Keyboard();
        String meal_name = keyboard.nextLine("Please enter the name of the meal: ");
        ArrayList<Recipe> recipes = user.getRecipes();
        ArrayList<Recipe> meal_recipes = new ArrayList<Recipe>();
        String recipe_name = "";

        while(!recipe_name.equals("quit")){
            recipe_name = keyboard.nextLine("Please enter the name of the recipe or type \"quit\": ");

            for(int i = 0; i < recipes.size(); i++){
                if (recipes.get(i).name.equals(recipe_name)){
                    meal_recipes.add(recipes.get(i));
                    break;
                }
            }
        }

        Meal meal = new Meal(meal_name, meal_recipes);
        user.addMeal(meal);
    }
}