import java.util.Scanner;

public class main{
   public static void main(String[] args) {
      String name;
      double height = 0.0;
      double weight = 0.0;
      String goal;
      Scanner keyboard = new Scanner(System.in);
      String command_str = "";

      System.out.println("Welcome to the NUTRiAPP. The app that will help create you new healthy life style!\n");

      // moving to another class
      System.out.println("To begin, please enter some information about yourself.");
      System.out.print("Full Name: ");
      name = keyboard.nextLine();
      while (height <= 0.0){
         System.out.print("Height (in.): ");
         height = keyboard.nextDouble();
      }
      while(weight <= 0.0){
         System.out.print("Weight (lbs.): ");
         weight = keyboard.nextDouble();
      }
      keyboard.nextLine();
      System.out.print("Now please enter a weight goal (Maintain, Lose, Gain): ");
      goal = keyboard.nextLine();
      System.out.println("Thank you, your profile has been saved and you are now ready to start using the NUTRiAPP!\n");
      // *
      
      System.out.println("Type help for a list of commands.\n");

      while (!command_str.equals("quit")){
         System.out.print("User@NUTRiAPP> ");
         command_str = keyboard.nextLine();
         Command command = new Command(command_str);
      }
   }
}