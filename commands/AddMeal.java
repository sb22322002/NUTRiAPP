public class AddMeal implements Command{
    public AddMeal(){
        execute();
    }

    private void execute(){
        System.out.println("added meal");
    }
}