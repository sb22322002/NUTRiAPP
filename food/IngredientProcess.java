
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class IngredientProcess  {  
    public static Ingredient readIngredientByName(String arg) {
        String line = "";      
        try   
        {  
        Ingredient thisIngredient = new Ingredient();
        BufferedReader br = new BufferedReader(new FileReader("./food/ingredients.csv"));  
        while ((line = br.readLine()) != null)  
        {  
            String[] ingredient = line.split(",");   
            if (ingredient[1].equals(arg)) {
                for (int i = 0; i < 53; i++) { // there happen to be 53 parts to each ingredient (and != null wasn't working when I tried it)
                //System.out.println(ingredient[1]); confirmation of running through all
                thisIngredient = new Ingredient(ingredient); //create new ingredient object
            }
            }
            
        } 
        br.close();
        return thisIngredient;  
        }   
        catch (IOException e)   {  
            e.printStackTrace();  
            }
        return null;
 
    }
    public static Ingredient readIngredientById(int arg)   
    {  
        String line = "";      
        String id = Integer.toString(arg);
        try   
        {  
        Ingredient thisIngredient = new Ingredient();
        BufferedReader br = new BufferedReader(new FileReader("./food/ingredients.csv"));  
        while ((line = br.readLine()) != null)  
        {  
            String[] ingredient = line.split(",");   
            if (ingredient[0].equals(id)) {
                for (int i = 0; i < 53; i++) { // there happen to be 53 parts to each ingredient (and != null wasn't working when I tried it)
                System.out.println(ingredient[1]); //confirmation of running through all
                thisIngredient = new Ingredient(ingredient); //create new ingredient object
            }
            }
            
        } 
        br.close();
        return thisIngredient;  
        }   
        catch (IOException e)   {  
            e.printStackTrace();  
            }
        return null;
 
    }  
}
