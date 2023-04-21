/**
 * The Help class implements the Command interface and provides a list of commands
 * that can be executed in the application.
 *
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class Help implements Command{
    private static String[] commands = {"help - prints out a list of commands",
        "addingredient - add a purchased ingredient to the stock",
        "addrecipe - save a new recipe",
        "addmeal - save a new meal",
        "preparemeal - prepare an existing meal",
        "logworkout - log a new workout",
        "createshoppinglist - create a new shopping list",
        "viewhistory - view user profile history in Weight, Calorie Intake, Meals, or Workouts"};;

    /**
     * The constructor initializes an instance of the Help class
     * and calls the execute method.
     */
    public Help(){
        execute();
    }

    /**
     * The execute method prints out a list of
     * available commands in the application.
     * */
    private void execute(){
        for (String i : commands){
            System.out.println(i);
        }
        System.out.println();
    }
}