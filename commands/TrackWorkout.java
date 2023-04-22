/**
 * The TrackWorkout class implements the Command interface and tracks a user's
 * workout based on user input for time and intensity level.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class TrackWorkout implements Command{
    /**
     * The constructor initializes an instance of the TrackWorkout class
     * and calls the execute method.
     */
    public TrackWorkout(){
        execute();
    }

    /**
     * The execute method prompts the user for input to track the workout
     * and saves the entered workout information.
     */
    private void execute(){
        Keyboard keyboard = new Keyboard();
        int minutes = keyboard.nextInt("Enter the time of your workout: ");
        String intensity = keyboard.nextWorkoutIntensity("Enter the intensity of your workout (\"high\", \"moderate\", or \"low\"): ");
        switch(intensity){
            case "high":
                HighIntensityWorkout high_workout = new HighIntensityWorkout(minutes);
                break;
            case "moderate":
                ModerateIntensityWorkout mod_workout = new ModerateIntensityWorkout(minutes);
                break;
            case "low":
                LowIntensityWorkout low_workout = new LowIntensityWorkout(minutes);
                break;
        }
    }
}