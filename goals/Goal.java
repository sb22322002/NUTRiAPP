public class Goal {
    private double daily_target_calories;
    private double calorie_count;

    public Goal(User user){
        switch(user.getGoal()){
            case "gain":
                daily_target_calories = (((10*user.getWeight()) + (6.25*user.getHeight()) - (5*user.calcAge()))*user. getActivity() + 505);
                break;
            case "maintain":
                daily_target_calories = (((10*user.getWeight()) + (6.25*user.getHeight()) - (5*user.calcAge()))*user. getActivity() + 5);
                break;
            case "lose":
                daily_target_calories = (((10*user.getWeight()) + (6.25*user.getHeight()) - (5*user.calcAge()))*user. getActivity() - 495);
                break;
        }
    }

    /**
     * Changes the target calories to be eaten per day
     */
    public void setTargetCalories(double newTarget){
        daily_target_calories = newTarget;
    }

    public double getCalorieCount(){ return calorie_count; }
    public void setCalorieCount(double _calorie_count) { calorie_count = _calorie_count; }
}