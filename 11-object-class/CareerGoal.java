
public class CareerGoal extends Goal {
	private String targetCompany;

	public CareerGoal(String goalName,
			int targetMonths, String targetCompany) {
		super(goalName, targetMonths);
		this.targetCompany = targetCompany;
	}

	public String getTargetCompany() {
		return targetCompany;
	}

	@Override
	public void displayGoal() {
		System.out.println("Career Goal");
		System.out.println("Goal Name: " + getGoalName());
		System.out.println("Target Months: " + getTargetMonths());
		System.out.println("Target Company: " + getTargetCompany());
	}

	@Override
	public String toString() {
		return "Career Goal\n" +
				"Goal Name: " + getGoalName() + "\n" +
				"Target Months: " + getTargetMonths() + "\n" +
				"Target Company: " + getTargetCompany();

	}
}
