import java.time.LocalDateTime;

/**
 * The HighIntensityWorkout class implements the Workout interface
 * and represents a high intensity type workout that can be tracked and logged.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class HighIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private LocalDateTime date_time;

    /**
     * The constructor initializes an instance of the HighIntensityWorkout class
     * with the given duration and calculates the calories burned during the workout.
     * @param _minutes the duration of the workout in minutes
     */
    public HighIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 10 * _minutes;
        date_time = LocalDateTime.now();
    }

    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public LocalDateTime getTime(){ return date_time; }
}