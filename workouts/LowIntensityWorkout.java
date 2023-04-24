import java.time.LocalDateTime;

/**
 * The LowIntensityWorkout class implements the Workout interface
 * and represents a low intensity type workout that can be tracked and logged.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class LowIntensityWorkout implements Workout{
    private int minutes;
    private double calories;
    private String time;

    public LowIntensityWorkout(){}

    /**
     * The constructor initializes an instance of the LowIntensityWorkout class
     * with the given duration and calculates the calories burned during the workout.
     * @param _minutes the duration of the workout in minutes
     */
    public LowIntensityWorkout(int _minutes){
        minutes = _minutes;
        calories = 5 * _minutes;
        time = LocalDateTime.now().toString();
    }

    public int getMinutes(){ return minutes; }
    public double getCalories(){ return calories; }
    public String getTime(){ return time; }
}