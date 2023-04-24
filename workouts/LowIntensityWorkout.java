import java.time.LocalDateTime;

public class LowIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private String time;

    public LowIntensityWorkout(){}

    public LowIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 5 * _minutes;
        time = LocalDateTime.now().toString();
    }

    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public String getTime(){ return time; }
}