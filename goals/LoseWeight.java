public class LoseWeight implements Goal {
    double targetCalories;

    public LoseWeight() {}


    @Override
    public double setTargetCalories(double newTarget) {
        this.targetCalories = newTarget;
        return targetCalories;
    }

}