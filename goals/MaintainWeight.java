public class MaintainWeight implements Goal {
    double targetCalories;

    public MaintainWeight() {}


    @Override
    public double setTargetCalories(double newTarget) {
        this.targetCalories = newTarget;
        return targetCalories;
    }

}
