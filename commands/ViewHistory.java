public class ViewHistory implements Command{
    public ViewHistory(User user){
        execute(user);
    }

    private void execute(User user){
        System.out.println(user.getHigh_intensity_workouts());
    }
}