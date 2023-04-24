import java.time.LocalDateTime;

public class ModerateIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private String date_time;

    public ModerateIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 7.5 * _minutes;
        date_time = LocalDateTime.now().toString();
    }

    public ModerateIntensityWorkout(int _minutes, String _date_time){
        minutes = _minutes;
        calories = 10 * _minutes;
        date_time = _date_time;
    }
    
    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public String getTime(){ return date_time; }
}