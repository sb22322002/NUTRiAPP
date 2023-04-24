import java.util.Scanner;

public class main{
   public static void main(String[] args) {
      String name;
      double height = 0.0;
      double weight = 0.0;
      String goal;
      Keyboard keyboard = new Keyboard();
      String command_str = "";

      User user = new User();
      
      System.out.println("Type \"help\" for a list of commands.\n");

      while (true){
         command_str = keyboard.nextLine(user.getUserName() + "@NUTRiAPP> ");
         CommandListener command = new CommandListener(command_str);
      }
   }
}