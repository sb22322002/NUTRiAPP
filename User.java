import java.time.LocalDate;  
import java.time.Period;  

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.ArrayList;

public class User {
   private String name;
   private double height;
   private double weight;
   private String bday; //YYYY-MM-DD format
   private String goal;
   private ArrayList<HighIntensityWorkout> high_intensity_workouts = new ArrayList<HighIntensityWorkout>();
   private ArrayList<ModerateIntensityWorkout> moderate_intensity_workouts = new ArrayList<ModerateIntensityWorkout>();
   private ArrayList<LowIntensityWorkout> low_intensity_workouts = new ArrayList<LowIntensityWorkout>();

   public User(){
      String saveFileName = "user.json";
      File saveFile = new File(saveFileName);
      //check if save file exists
      if (!saveFile.exists()) {
         createNewSave(saveFile);
      }
      else{
         readSaveFile(saveFileName);
      }
   }

   //accessors
   public String getName() { return name; }
   public double getHeight() { return height; }
   public double getWeight() { return weight; }
   public String getGoal() { return goal; }
   public String getBday() { return bday; }

   //modifiers
   public void setName(String _name) { name = _name; } 
   public void setHeight(double _height) { height = _height; }
   public void setWeight(double _weight) { weight = _weight; }
   public void setGoal(String _goal) { goal = _goal; }
   public void setBday(String _bday) { bday = _bday; }


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
      goal = keyboard.nextLine("Now please enter a weight goal (\"maintain\", \"lose\", \"gain\": ");
      System.out.println("Thank you, your profile has been saved and you are now ready to start using the NUTRiAPP!\n");
   }

   private void readSaveFile(String saveFileName){
      System.out.print("Welcome back! ");
      // A lot of parsing... definitely would be better to use extended library
      // try {
      //    BufferedReader reader = new BufferedReader(new FileReader(saveFileName));
      //    String line = reader.readLine();
      //    String jsonString = "";

      //    while (line != null) {
      //       jsonString += line;
      //       // read next line
      //       line = reader.readLine();
      //    }

      //    reader.close();

      //    name = jsonString.split("\"name\": \"", 2)[1].split("\"", 2)[0];
      //    height = Double.parseDouble(jsonString.split("\"height\": ", 2)[1].split(",", 2)[0]);
      //    weight = Double.parseDouble(jsonString.split("\"weight\": ", 2)[1].split(",", 2)[0]);
      //    goal = jsonString.split("\"goal\": \"", 2)[1].split("\"", 2)[0];

      //    if (jsonString.contains("\"high_intensity_workouts\": [")){
      //       String high_workouts = jsonString.split("\"high_intensity_workouts\": ", 2)[1].split("]", 2)[0];
      //       int lastIndex = 0;
      //       int count = 0;

      //       while (lastIndex != -1) {
      //          lastIndex = high_workouts.indexOf("\"minutes\": ", lastIndex);

      //          if (lastIndex != -1) {
      //             count++;
      //             lastIndex += "\"minutes\": ".length();
      //             String high_workout_str = high_workouts.substring(lastIndex, high_workouts.length()).split("}", 2)[0];
      //             System.out.println(high_workout_str);
      //             int minutes = Integer.parseInt(high_workout_str.split(",", 2))[0];
      //             String date_time = high_workout_str.split("\"date_time\": \"", 2)[1].split("\"", 2)[0];
      //             System.out.print(minutes + " ");
      //             System.out.println(date_time);
      //             HighIntensityWorkout high_intensity_workout = new HighIntensityWorkout(minutes, date_time);
      //             high_intensity_workouts.add(high_intensity_workout);
      //             System.out.println(high_workout_str);
      //          }
      //       }
      //    }

      //    System.out.println(name + height + weight + goal);
      // }
      //    catch (IOException e) {
      //    e.printStackTrace();
      // }


   }

   public String getUserName(){
      return "User";
   }
}
