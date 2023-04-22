public class ViewHistory implements Command{
    public ViewHistory(){
        execute();
    }

    private void execute(){
        System.out.println("viewed history");
    }
}