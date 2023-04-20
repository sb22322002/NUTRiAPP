
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class IngredientProcess  {  
    public static void readIngredients(int arg)   
    {  
    String line = "";      
    String id = Integer.toString(arg);
    try   
    {  
    BufferedReader br = new BufferedReader(new FileReader("./food/ingredients.csv"));  
    while ((line = br.readLine()) != null)  
    {  
        String[] ingredient = line.split(",");   
        if (ingredient[0].equals(id)) {
            for (int i = 0; i < 53; i++) { // there happen to be 53 parts to each ingredient (and != null wasn't working when I tried it)
            //System.out.println(ingredient[i]); confirmation of running through all
            Ingredient thisIngredient = new Ingredient(ingredient); //create new ingredient object
        }
        }
        
     }  
    }   
    catch (IOException e)   {  
        e.printStackTrace();  
        }  
    }  
}  

