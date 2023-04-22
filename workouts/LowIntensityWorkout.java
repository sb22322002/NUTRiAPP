import java.time.LocalDateTime;

public class LowIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private LocalDateTime date_time;

    public LowIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 5 * _minutes;
        date_time = LocalDateTime.now();
    }

    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public LocalDateTime getTime(){ return date_time; }
}