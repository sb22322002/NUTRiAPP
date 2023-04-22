public class CreateShoppingList implements Command{
    public CreateShoppingList(){
        execute();
    }

    private void execute(){
        System.out.println("created shopping list");
    }
}