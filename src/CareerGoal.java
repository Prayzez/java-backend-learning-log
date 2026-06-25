
public class CareerGoal extends StudyGoal{
	private String targetCompany;
	public CareerGoal(String goalName,
			int targetMonths,
			double weeklyHours, String targetCompany) {
			super(goalName, targetMonths, weeklyHours);
			this.targetCompany = targetCompany;
	}
	
	public String getTargetCompany() {
		return targetCompany;
	}
}
