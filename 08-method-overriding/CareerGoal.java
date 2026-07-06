
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
		super.displayGoal();
		System.out.println("Target Company: " + getTargetCompany());
	}
}
