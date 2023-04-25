import java.time.LocalDate;  
import java.time.Period; 

import java.io.File;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class represents a user of the NUTRiAPP application,
 * and contains their personal information.
 * 
 * @author Daniel Kaszuba
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
 */
public class User {
   private String name;
   private double height;
   private double weight;
   private double activity;
   private String goal;
   private String bday;
   private String username;
   private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
   private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
   private ArrayList<Meal> meals = new ArrayList<Meal>();
   private ArrayList<HighIntensityWorkout> high_intensity_workouts = new ArrayList<HighIntensityWorkout>();
   private ArrayList<ModerateIntensityWorkout> moderate_intensity_workouts = new ArrayList<ModerateIntensityWorkout>();
   private ArrayList<LowIntensityWorkout> low_intensity_workouts = new ArrayList<LowIntensityWorkout>();

   /**
    * Default constructor for the User class. Creates a new empty User object.
    * This is used when a "user.json" file is found.
    */
   public User(){
      // Registers a shutdown hook to save user profile data when the application is closed.
      Runtime.getRuntime().addShutdownHook(new Thread(){
         public void run(){
            saveProfile();
         }
      });
   }

   /**
    * Constructor for the User class that creates a new User object
    * and saves their input to a new "user.json" file.
    * @param saveFile the file the user's data will be saved
    */
   public User(File saveFile){
      createNewSave(saveFile);
      // Registers a shutdown hook to save user profile data when the application is closed.
      Runtime.getRuntime().addShutdownHook(new Thread(){
         public void run(){
            saveProfile();
         }
      });
   }

   //accessors
   public String getName() { return name; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
   public String getGoal() { return goal; }
   public String getBday() { return bday; }
   public double getActivity() { return activity; }
   // note - naming conventions for accessors are due to ObjectMapper reading
   public ArrayList<Ingredient> getIngredients(){ return ingredients; }
   public ArrayList<Recipe> getRecipes(){ return recipes; }
   public ArrayList<Meal> getMeals(){ return meals; }
   public ArrayList<HighIntensityWorkout> getHigh_intensity_workouts(){ return high_intensity_workouts; }
   public ArrayList<ModerateIntensityWorkout> getModerate_intensity_workouts(){ return moderate_intensity_workouts; }
   public ArrayList<LowIntensityWorkout> getLow_intensity_workouts(){ return low_intensity_workouts; }
   

   //modifiers
   public void setName(String _name) { name = _name; } 
   public void setHeight(double _height) { height = _height; }
   public void setWeight(double _weight) { weight = _weight; }
   public void setGoal(String _goal) { goal = _goal; }
   public void setBday(String _bday) { bday = _bday; }
   public void addIngredient(Ingredient ingredient) { ingredients.add(ingredient); }
   public void addRecipe(Recipe recipe) { recipes.add(recipe); }
   public void addMeal(Meal meal){ meals.add(meal); }
   public void setActivity(double _activity) { activity = _activity; }
   public void addHighIntensityWorkout(HighIntensityWorkout workout) { high_intensity_workouts.add(workout); }
   public void addModerateIntensityWorkout(ModerateIntensityWorkout workout) { moderate_intensity_workouts.add(workout); }
   public void addLowIntensityWorkout(LowIntensityWorkout workout) { low_intensity_workouts.add(workout); }


   /**
    * Computes the age of the user based on their birthdate.
    * @param birthdate a String representing the user's birthdate in the format "YYYY-MM-DD"
    * @return the age of the user as an int
    */
   public int calcAge () {
      LocalDate dob = LocalDate.parse(bday); 
      LocalDate curDate = LocalDate.now();
      return Period.between(dob, curDate).getYears();
   }

   /**
    * Creates a new save file for the user and prompts the user for their personal information.
    * @param saveFile the file in which the user's data will be saved
    */
   private void createNewSave(File saveFile){
      Keyboard keyboard = new Keyboard();
      System.out.println("Welcome to the NUTRiAPP. The app that will help create you new healthy life style!\n");

      System.out.println("To begin, please enter some information about yourself.");
      name = keyboard.nextLine("Full Name: ");
      height = keyboard.nextDouble("Height (in.): ");
      weight = keyboard.nextDouble("Weight (lbs.): ");
      bday = keyboard.nextBirthday("Date of Birth (YYYY-MM-DD): ");
      goal = keyboard.nextLine("Now please enter a weight goal (\"maintain\", \"lose\", \"gain\": ");
      activity = 1.2 + (0.08) * (keyboard.nextInt("Now please enter your planned activity level on a scale of 0 to 10: "));
      System.out.println("Thank you, your profile has been saved and you are now ready to start using the NUTRiAPP!\n");
   }

   /**
    * Returns the username of the user.
    * @return the username of the user
    */
   public String userName(){
      if (!name.contains(" ")){
         return name;
      }
      return name.split(" ", 2)[0] + name.substring(name.lastIndexOf(" ")+1);
   }

   /**
    * This method occurs on shutdown and saves the user's profile to a
    * JSON file named "user.json" using the Jackson ObjectMapper library.
    */
   private void saveProfile(){
      String SAVE_FILE_NAME = "user.json";
      ObjectMapper om = new ObjectMapper();
      try {
         File file = new File(SAVE_FILE_NAME);
         om.writeValue(file, this);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
