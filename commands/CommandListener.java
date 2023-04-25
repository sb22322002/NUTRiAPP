/**
 * The CommandListener class listens to commands entered by the user and executes
 * the corresponding command.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class CommandListener{
    /**
     * The constructor initializes an instance of the CommandListener
     * class with a specified command and executes the corresponding command.
     * 
     * @param command A string representing the command to be executed.
     */
    public CommandListener(String command, User user){
        switch(command.toLowerCase()){
            case "help":
                Help help = new Help();
                break;
            case "addingredient":
                AddIngredient addIngredient = new AddIngredient(user);
                break;
            case "addrecipe":
                AddRecipe addRecipe = new AddRecipe(user);
                break;
            case "addmeal":
                AddMeal addMeal = new AddMeal();
                break;
            case "preparemeal":
                PrepareMeal prepareMeal = new PrepareMeal();
                break;
            case "trackworkout":
                TrackWorkout trackWorkout = new TrackWorkout(user);
                break;
            case "createshoppinglist":
                CreateShoppingList createShoppingList = new CreateShoppingList();
                break;
            case "viewhistory":
                ViewHistory viewHistory = new ViewHistory(user);
                break;
            case "quit":
                System.exit(0);
                break;
            default:
                System.out.println("Error - Unknown command. Type \"help\" for a list of commands.");
                break;
        }
    }
}