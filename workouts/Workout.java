import java.time.LocalDateTime;

/**
 * The Workout interface provides a blueprint for a
 * workout that can be tracked and logged.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public interface Workout{
    /**
     * Gets the duration of the workout in minutes.
     * @return the duration of the workout in minutes
     */
    public int getMinutes();
    /**
     * Gets the number of calories burned during the workout.
     * @return the number of calories burned during the workout
     */
    public double getCalories();
    /**
     * Gets the time that the workout was completed.
     * @return the time that the workout was completed
     */
    public LocalDateTime getTime();
}