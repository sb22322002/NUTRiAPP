public class PrepareMeal implements Command{
    public PrepareMeal(){
        execute();
    }

    private void execute(){
        System.out.println("prepared meal");
    }
}