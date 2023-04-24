import java.time.LocalDate;  
import java.time.Period; 

import java.io.File;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
   private String name;
   private double height;
   private double weight;
   private String goal;
   private String bday;
   private String username;
   private ArrayList<HighIntensityWorkout> high_intensity_workouts = new ArrayList<HighIntensityWorkout>();
   private ArrayList<ModerateIntensityWorkout> moderate_intensity_workouts = new ArrayList<ModerateIntensityWorkout>();
   private ArrayList<LowIntensityWorkout> low_intensity_workouts = new ArrayList<LowIntensityWorkout>();

   public User(){
      Runtime.getRuntime().addShutdownHook(new Thread(){
         public void run(){
            saveProfile();
         }
      });
   }

   public User(File saveFile){
      createNewSave(saveFile);
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
   public ArrayList<HighIntensityWorkout> getHigh_intensity_workouts(){ return high_intensity_workouts; }
   public ArrayList<ModerateIntensityWorkout> getModerate_intensity_workouts(){ return moderate_intensity_workouts; }
   public ArrayList<LowIntensityWorkout> getLow_intensity_workouts(){ return low_intensity_workouts; }
   

   //modifiers
   public void setName(String _name) { name = _name; } 
   public void setHeight(double _height) { height = _height; }
   public void setWeight(double _weight) { weight = _weight; }
   public void setGoal(String _goal) { goal = _goal; }
   public void setBday(String _bday) { bday = _bday; }
   public void addHighIntensityWorkout(HighIntensityWorkout workout) { high_intensity_workouts.add(workout); }
   public void addModerateIntensityWorkout(ModerateIntensityWorkout workout) { moderate_intensity_workouts.add(workout); }
   public void addLowIntensityWorkout(LowIntensityWorkout workout) { low_intensity_workouts.add(workout); }


   //compute age
   public static int getAge (String birthdate) {
      LocalDate dob = LocalDate.parse(birthdate); 
      LocalDate curDate = LocalDate.now();
      return Period.between(dob, curDate).getYears();
   }

   private void createNewSave(File saveFile){
      Keyboard keyboard = new Keyboard();
      System.out.println("Welcome to the NUTRiAPP. The app that will help create you new healthy life style!\n");

      System.out.println("To begin, please enter some information about yourself.");
      name = keyboard.nextLine("Full Name: ");
      height = keyboard.nextDouble("Height (in.): ");
      weight = keyboard.nextDouble("Weight (lbs.): ");
      bday = keyboard.nextBirthday("Date of Birth (YYYY-MM-DD): ");
      goal = keyboard.nextLine("Now please enter a weight goal (\"maintain\", \"lose\", \"gain\": ");
      System.out.println("Thank you, your profile has been saved and you are now ready to start using the NUTRiAPP!\n");
   }

   public String userName(){
      if (!name.contains(" ")){
         return name;
      }
      return name.split(" ", 2)[0] + name.substring(name.lastIndexOf(" ")+1);
   }

   private void saveProfile(){
      ObjectMapper om = new ObjectMapper();
      try {
         File file = new File("user.json");
         om.writeValue(file, this);
         System.out.println("User profile saved to file: " + file.getAbsolutePath());
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
