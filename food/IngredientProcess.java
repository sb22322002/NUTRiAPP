
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class IngredientProcess  {  
    public static void searchIngredientsByName(String arg) {
        String line = "";
        try
        {
        BufferedReader br = new BufferedReader(new FileReader("./food/ingredients.csv"));
        while ((line = br.readLine()) != null)
        {
            String[] ingredient = line.split(",");
            if (line.toLowerCase().contains(arg.toLowerCase())) {
                for (int i = 0; i < 4; i++) { 
                    System.out.print(ingredient[i] + " "); 
                }
                System.out.print("\n");
            }

        } 
        br.close();
        }
        catch (IOException e)   {
            e.printStackTrace();
            }
 
    } 
    public static Ingredient readIngredientById(int arg)   
    {  
        String line = "";      
        try   
        {  
        Ingredient thisIngredient = new Ingredient();
        BufferedReader br = new BufferedReader(new FileReader("./food/ingredients.csv"));  
        br.readLine();
        while ((line = br.readLine()) != null)  
        {  
            String[] ingredient = line.split(",");   
            if (Integer.parseInt(ingredient[0]) == arg) {
                thisIngredient = new Ingredient(line); //create new ingredient object
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

