public class Help implements Command{
    private static String[] commands = {"help - prints out a list of commands",
        "addingredient - add a purchased ingredient to the stock",
        "addrecipe - save a new recipe",
        "addmeal - save a new meal",
        "preparemeal - prepare an existing meal",
        "logworkout - log a new workout",
        "createshoppinglist - create a new shopping list",
        "viewhistory - view user profile history in Weight, Calorie Intake, Meals, or Workouts"};;

    public Help(){
        execute();
    }

    public void execute(){
        for (String i : commands){
            System.out.println(i);
        }
        System.out.println();
    }
}