public class StudyGoalDemo {

	public static void main(String[] args) {

		StudyGoal goal =
				new StudyGoal(
					"Become a Java backend developer",
					7,
					20.5
				);


		System.out.println("Study Goal Summary"); // 学習目標のまとめ
		System.out.println("Goal Name: " + goal.goalName); // 目標名：
		System.out.println("Target Months: " + goal.targetMonths); // 目標達成までの月数：
		System.out.println("Weekly Hours: " + goal.weeklyHours); // 週あたりの学習時間：

		System.out.println();

		StudyGoal goal2 =
				new StudyGoal(
					"Pass JLPT N2",
					6,
					10
				);

		System.out.println("Second Goal Summary"); // 2つ目の学習目標のまとめ
		System.out.println("Goal Name: " + goal2.goalName); // 目標名：
		System.out.println("Target Months: " + goal2.targetMonths); // 目標達成までの月数：
		System.out.println("Weekly Hours: " + goal2.weeklyHours); // 週あたりの学習時間：
	}
}