import java.util.Scanner;

public class main{
   public static void main(String[] args) {
      String name;
      double height = 0.0;
      double weight = 0.0;
      String goal;
      Keyboard keyboard = new Keyboard();
      String command_str = "";

      System.out.println("Welcome to the NUTRiAPP. The app that will help create you new healthy life style!\n");

      // moving to another class
      System.out.println("To begin, please enter some information about yourself.");
      name = keyboard.nextLine("Full Name: ");
      height = keyboard.nextDouble("Height (in.): ");
      weight = keyboard.nextDouble("Weight (lbs.): ");
      goal = keyboard.nextLine("Now please enter a weight goal (Maintain, Lose, Gain): ");
      System.out.println("Thank you, your profile has been saved and you are now ready to start using the NUTRiAPP!\n");
      // *
      
      System.out.println("Type help for a list of commands.\n");

      while (!command_str.equals("quit")){
         command_str = keyboard.nextLine("User@NUTRiAPP> ");
         CommandListener command = new CommandListener(command_str);
      }
   }
}