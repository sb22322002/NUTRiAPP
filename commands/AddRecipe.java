public class AddRecipe implements Command{
    public AddRecipe(User user){
        execute(user);
    }

    private void execute(User user){
        System.out.println("added recipe");
    }
}