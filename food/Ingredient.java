public class Ingredient {
    int id;
    public Ingredient(String[] modifiers) {
        this.id = Integer.parseInt(modifiers[0]);
        System.out.println(this.id);
    }

    @Override 
    public String toString() {
        String result = Integer.toString(id);
        return result;
    }
}
