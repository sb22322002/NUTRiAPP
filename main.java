import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class main{
   private static final String SAVE_FILE_NAME = "user.json";

   public static void main(String[] args) {
      Keyboard keyboard = new Keyboard();
      String command_str = "";
      User user = new User();

      File saveFile = new File(SAVE_FILE_NAME);
      try{
         if (saveFile.exists()){
            System.out.print("Welcome back! ");
            ObjectMapper om = new ObjectMapper();
            om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            //JSON file to Java object
            user = om.readValue(saveFile, User.class);
         }
         else{
            user = new User(saveFile);
         }
      }
      catch(IOException e){
         e.printStackTrace();
      }
      System.out.println("Type \"help\" for a list of commands.\n");

      while (true){
         command_str = keyboard.nextLine(user.getUserName() + "@NUTRiAPP> ");
         CommandListener command = new CommandListener(command_str, user);
      }
   }
}