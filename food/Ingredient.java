import java.util.Arrays;

public class Ingredient {
    String id;
    String desc;
    String name;
    String[] nutrition;
    int stock;
    public Ingredient(String[] modifiers) {
        this.id = modifiers[0];
        this.name = modifiers[1].split(",")[0];
        this.desc = modifiers[1];
        this.nutrition = Arrays.copyOfRange(modifiers, 2, -1);;
        System.out.println(this.id);
    }
    public Ingredient() {
        this.id = "0000";
        this.stock = 1;
    }

    public String getDesc() {
        return desc;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String[] getNutrition() {
        return nutrition;
    }
    public int getStock() {
        return stock;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setId(String id) {
        this.id = id;
    }public void setName(String name) {
        this.name = name;
    }public void setNutrition(String[] nutrition) {
        this.nutrition = nutrition;
    }public void setStock(int stock) {
        this.stock = stock;
    }
    @Override 
    public String toString() {
        String result = "ID: " + id;
        return result;
    }
}
