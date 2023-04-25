public class Ingredient {
    String id;
    String name;
    double calories;

    String nutrition;
    int stock;
    public Ingredient(String modifiers) {
        this.id = modifiers.split(",")[0];
        this.name = modifiers.split(",\"")[1].split("\",")[0];
        this.calories = Double.parseDouble(modifiers.split("\",")[1].split(",")[1]);
        this.nutrition = modifiers.split("\",")[1];
        this.stock = 0;
    }
    public Ingredient() {
        this.id = "0000";
        this.stock = 1;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNutrition() {
        return nutrition;
    }
    public int getStock() {
        return stock;
    }
    public void setId(String id) {
        this.id = id;
    }public void setName(String name) {
        this.name = name;
    }public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }public void setStock(int stock) {
        this.stock = stock;
    }
    public void addStock(int stock) {
        this.stock += stock;
    }
    public void substractStock(int stock) {
        this.stock -= stock;
    }
    @Override 
    public String toString() {
        String result = "ID: " + id;
        return result;
    }
}
