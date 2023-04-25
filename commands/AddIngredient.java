public class AddIngredient implements Command{
    public AddIngredient(){
        execute();
    }

    private void execute(){
        Keyboard keyboard = new Keyboard();
        String ingredient_name = keyboard.nextLine("Please enter the name of the ingredient: ");

        Ingredient ingredient = IngredientProcess.readIngredientByName(ingredient_name);
        System.out.println(ingredient);
    }
}