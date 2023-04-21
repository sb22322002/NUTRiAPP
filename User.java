import java.io.*;
import java.util.*;
import java.time.LocalDate;  
import java.time.Period;  


public class User {
   String name;
   double height = 0.0;
   double weight = 0.0;
   String goal;
   String bday; //YYYY-MM-DD format
   
   public User(){}
   
   public User(String _name, double _height, double _weight, String _goal, String _bday) {
      this.name = _name;
      this.height = _height;
      this.weight = _weight;
      this.goal = _goal;
      this.bday = _bday;
      
      
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
   
    
}
