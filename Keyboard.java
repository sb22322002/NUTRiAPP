import java.util.Scanner;
import java.util.NoSuchElementException;
import java.lang.NumberFormatException;

/**
 * The Keyboard class provides methods for reading input from the keyboard.
 * This class provides methods for reading several different variables and
 * will continue to prompt the user until valid input is received. If an error
 * occurs, an appropriate error message will be printed to the console.
 * 
 * @author Seth Button-Mosher
 * @version 1.0
 * @since 4/21/2023
*/
public class Keyboard{
    private Scanner scan;
    
    public Keyboard(){
        scan = new Scanner(System.in);
    }

    /**
     * Prompts the user for input and reads a string from the standard input stream.
     * 
     * @param prompt - a message to display to the user before reading input
     * @return input_str - the string entered by the user
     * @throws NoSuchElementException if the scanner is closed suddenly
     * @throws Exception if any other error occurs while reading input
     */
    public String nextLine(String prompt){
        String input_str = "";
        
        while (input_str.equals("")){

            System.out.print(prompt);

            try{
                input_str = scan.nextLine();
            }
            catch(NoSuchElementException noEle){
                System.exit(1);
            }
            catch(Exception e){
                System.out.println("Error - " + e);
                System.exit(1);
            }
        }

        return input_str;
    }

    /**
     * Prompts the user for input and reads an int from the standard input stream.
     * 
     * @param prompt - a message to display to the user before reading input
     * @return input_int - the int entered by the user
     * @throws NumberFormatException if the input is not a number
     * @throws NoSuchElementException if the scanner is closed suddenly
     * @throws Exception if any other error occurs while reading input
     */
    public int nextInt(String prompt){
        int input_int = 0;

        while (input_int <= 0){

            System.out.print(prompt);

            try{
                input_int = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException nan){
                System.out.println("Error - Please enter an integer.");
            }
            catch(NoSuchElementException noEle){
                System.exit(1);
            }
            catch(Exception e){
                System.out.println("Error - " + e);
                System.exit(1);
            }
        }
        
        return input_int;
    }

    /**
     * Prompts the user for input and reads a double from the standard input stream.
     * 
     * @param prompt - a message to display to the user before reading input
     * @return input_double - the number entered by the user
     * @throws NumberFormatException if the input is not a number
     * @throws NoSuchElementException if the scanner is closed suddenly
     * @throws Exception if any other error occurs while reading input
     */
    public double nextDouble(String prompt){
        double input_double = 0.0;

        while (input_double <= 0.0){

            System.out.print(prompt);

            try{
                input_double = Double.parseDouble(scan.nextLine());
            }
            catch(NumberFormatException nan){
                System.out.println("Error - Please enter a number.");
            }
            catch(NoSuchElementException noEle){
                System.exit(1);
            }
            catch(Exception e){
                System.out.println("Error - " + e);
                System.exit(1);
            }
        }

        return input_double;
    }

    /**
     * Prompts the user for a workout intensity and reads a string from the standard input stream.
     * 
     * @param prompt - a message to display to the user before reading input
     * @return input_str - the workout intensity entered by the user
     * @throws NoSuchElementException if the scanner is closed suddenly
     * @throws Exception if any other error occurs while reading input
     */
    public String nextWorkoutIntensity(String prompt){
        String input_str = "";
        
        while (!input_str.equals("high") &&
        !input_str.equals("moderate") &&
        !input_str.equals("low")){

            System.out.print(prompt);

            try{
                input_str = scan.nextLine().toLowerCase();

                if(!input_str.equals("high") &&
                !input_str.equals("moderate") &&
                !input_str.equals("low")){
                    System.out.println("Error - Please enter \"high\", \"moderate\", or \"low\"");
                }
            }
            catch(NoSuchElementException noEle){
                System.exit(1);
            }
            catch(Exception e){
                System.out.println("Error - " + e);
                System.exit(1);
            }
        }

        return input_str;
    }
}