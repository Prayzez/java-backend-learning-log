public class StudyGoal{
	private String goalName;
	private int targetMonths;
	private double weeklyHours;
	public StudyGoal(
			String goalName,
			int targetMonths,
			double weeklyHours) {
		this.goalName = goalName;
		this.targetMonths = targetMonths;
		this.weeklyHours = weeklyHours;
	}
	
	public String getGoalName(){
		return goalName;
	}
	
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	
	public int getTargetMonths() {
		return targetMonths;
	}
	
	public void setTargetMonths(int targetMonths) {

		if (targetMonths > 0) {
			this.targetMonths = targetMonths;
		}
	}
	
	public double getWeeklyHours() {
		return weeklyHours;
	}
	
	public void setWeeklyHours(double weeklyHours) {
		this.weeklyHours = weeklyHours;
	}
}