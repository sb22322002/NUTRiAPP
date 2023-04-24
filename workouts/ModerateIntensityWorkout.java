import java.time.LocalDateTime;

public class ModerateIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private String time;

    public ModerateIntensityWorkout(){}

    public ModerateIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 7.5 * _minutes;
        time = LocalDateTime.now().toString();
    }
    
    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public String getTime(){ return time; }
}