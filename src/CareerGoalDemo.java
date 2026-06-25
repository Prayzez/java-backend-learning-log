
public class CareerGoalDemo {

	public static void main(String[] args) {
		CareerGoal goal = new CareerGoal("Become a Java backend developer",
				7,
				20.5,
				"Example Tech"
				);
		
		System.out.println("Goal Name: " + goal.getGoalName());
		System.out.println("Target Months: " + goal.getTargetMonths());
		System.out.println("Weekly Hours: " + goal.getWeeklyHours());
		System.out.println("Target Company: " + goal.getTargetCompany());
				
	}

}
