public class PrepareMeal implements Command{
    public PrepareMeal(User user){
        execute(user);
    }

    private void execute(User user){
        System.out.println("prepared meal");
    }
}