
public class StudyGoalEncapsulationDemo {

	public static void main(String[] args) {
		StudyGoal goal = new StudyGoal(
				"Become a Java backend developer",
				7,
				20.5); 
		
		System.out.println("Original Goal");
		System.out.println(goal.getGoalName());
		System.out.println(goal.getTargetMonths());
		System.out.println(goal.getWeeklyHours());
		goal.setGoalName("Learn Spring Boot");
		goal.setTargetMonths(8);
		goal.setWeeklyHours(25);
		
		System.out.println("Updated Goal");
		System.out.println(goal.getGoalName());
		System.out.println(goal.getTargetMonths());
		System.out.println(goal.getWeeklyHours());
	}


}
