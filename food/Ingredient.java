import java.util.Arrays;

public class Ingredient {
    int id;
    String desc;
    String name;
    String[] nutrition;
    public Ingredient(String[] modifiers) {
        this.id = Integer.parseInt(modifiers[0]);
        this.name = modifiers[1].split(",")[0];
        this.desc = modifiers[1];
        this.nutrition = Arrays.copyOfRange(modifiers, 2, -1);;
        System.out.println(this.id);
    }
    public Ingredient() {
        this.id = 0000;
    }

    @Override 
    public String toString() {
        String result = "ID: " + Integer.toString(id);
        return result;
    }
}
