
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class IngredientProcess  {  
    public static void main(String[] args)   
    {  
    String line = "";  
    String splitBy = ",";  
    try   
    {  
    //parsing a CSV file into BufferedReader class constructor  
    BufferedReader br = new BufferedReader(new FileReader("ingredients.csv"));  
    while ((line = br.readLine()) != null)   //returns a Boolean value  
    {  
    String[] ingredient = line.split(splitBy);    // use comma as separator  
    for (int i = 0; ingredient[i] != null; i++) {

    }
    }  
    }   
    catch (IOException e)   {  
        e.printStackTrace();  
        }  
    }  
}  

