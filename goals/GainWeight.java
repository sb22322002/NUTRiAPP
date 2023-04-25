public class GainWeight implements Goal {
    double targetCalories;

    public GainWeight() {}


    @Override
    public double setTargetCalories(double newTarget) {
        this.targetCalories = newTarget;
        return targetCalories;
    }

}