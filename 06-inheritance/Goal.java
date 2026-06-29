public class Goal {
    private String goalName;
    private int targetMonths;

    public Goal(String goalName, int targetMonths) {
        this.goalName = goalName;
        this.targetMonths = targetMonths;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        if (goalName != null && !goalName.isBlank()) {
            this.goalName = goalName;
        } else {
            System.out.println("Invalid goal name. Keeping the previous value.");
        }
    }

    public int getTargetMonths() {
        return targetMonths;
    }

    public void setTargetMonths(int targetMonths) {
        if (targetMonths > 0) {
            this.targetMonths = targetMonths;
        } else {
            System.out.println("Invalid target months. Keeping the previous value.");
        }
    }
}