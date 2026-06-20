public class StudyGoalTracker {

	public static void main(String[] args) {

		String[] goals = {
				"Pass JLPT N2",
				"Become a Java backend developer",
				"Build a portfolio project",
				"Learn Spring Boot",
				"Get hired"
		};

		System.out.println("My Study Goals"); // 私の学習目標

		for (int i = 0; i < goals.length; i++) {
			System.out.println("Goal " + (i + 1) + ": " + goals[i]); // 目標○：
		}

		System.out.println("Total goals: " + goals.length); // 目標の総数：

		System.out.println("First goal: " + goals[0]); // 最初の目標：
		System.out.println("Last goal: " + goals[goals.length - 1]); // 最後の目標：
	}
}