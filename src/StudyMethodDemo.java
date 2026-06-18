import java.util.Scanner;

public class StudyMethodDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your study goal: "); // 学習目標を入力してください：
		String studyGoal = scanner.nextLine();

		System.out.print("How many weeks do you plan to study? "); // 何週間勉強しますか？
		int weeks = scanner.nextInt();

		System.out.print("How many hours do you study each week? "); // 毎週何時間勉強しますか？
		double weeklyHours = scanner.nextDouble();

		printWelcomeMessage();
		printStudyGoal(studyGoal);

		double totalHours = calculateTotalHours(weeks, weeklyHours);

		System.out.println("Estimated total study hours: " + totalHours); // 推定総学習時間：
	}

	public static void printWelcomeMessage() {
		System.out.println("Welcome to the Study Planner!"); // 学習プランナーへようこそ！
	}

	public static void printStudyGoal(String goal) {
		System.out.println("Study Goal: " + goal); // 学習目標：
	}

	public static double calculateTotalHours(int weeks, double weeklyHours) {
		return weeks * weeklyHours;
	}
}