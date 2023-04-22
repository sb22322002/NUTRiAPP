public class Food {
    private String name;
    private double caloriesPerUnit;
    private double gramsOfFat;
    private double protein;
    private double fiber;
    private double carbsPerUnit;
    
    public Food(String name, double caloriesPerUnit, double gramsOfFat, double protein, double fiber, double carbsPerUnit) {
        this.name = name;
        this.caloriesPerUnit = caloriesPerUnit;
        this.gramsOfFat = gramsOfFat;
        this.protein = protein;
        this.fiber = fiber;
        this.carbsPerUnit = carbsPerUnit;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getCaloriesPerUnit() {return caloriesPerUnit;}
    public void setCaloriesPerUnit(double caloriesPerUnit) {this.caloriesPerUnit = caloriesPerUnit;}

    public double getGramsOfFat() {return gramsOfFat;}
    public void setGramsOfFat(double gramsOfFat) {this.gramsOfFat = gramsOfFat;}

    public double getProtein() {return protein;}

    public void setProtein(double protein) {this.protein = protein;}

    public double getFiber() {return fiber;}
    public void setFiber(double fiber) {this.fiber = fiber;}

    public double getCarbsPerUnit() {return carbsPerUnit;}
    public void setCarbsPerUnit(double carbsPerUnit) {this.carbsPerUnit = carbsPerUnit;}
}