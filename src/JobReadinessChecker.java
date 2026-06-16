import java.util.Scanner;

public class JobReadinessChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your weekly study hours: "); // 週平均学習時間を入力してください：
		double weeklyHours = scanner.nextDouble();

		System.out.print("Enter the number of months you plan to study: "); // 何か月勉強する予定か入力してください：
		int studyMonths = scanner.nextInt();

		System.out.print("Are you preparing for the JLPT N2? (true/false): "); // JLPT N2の準備をしていますか？（true/false）
		boolean preparingForN2 = scanner.nextBoolean();

		System.out.println();
		System.out.println("Job Readiness Summary"); // 就職準備状況のまとめ
		System.out.println("Weekly study hours: " + weeklyHours); // 週平均学習時間：
		System.out.println("Planned study months: " + studyMonths); // 予定している学習月数：
		System.out.println("Preparing for JLPT N2: " + preparingForN2); // JLPT N2の準備状況：

		if (weeklyHours >= 15 && studyMonths >= 6) {
			System.out.println("You are following a strong study plan."); // 良い学習計画で進めています。
		} else {
			System.out.println("Your study plan may need improvement."); // 学習計画を改善する必要があるかもしれません。
		}

		if (studyMonths >= 6 || preparingForN2 == true) {
			System.out.println("You are building valuable career skills."); // 価値のあるキャリアスキルを身につけています。
		} else {
			System.out.println("Consider strengthening your long-term career preparation."); // 長期的なキャリア準備を強化することを検討しましょう。
		}

		if (!preparingForN2) {
			System.out.println("Consider preparing for the JLPT N2."); // JLPT N2の準備を始めることを検討しましょう。
		} else {
			System.out.println("Good job preparing for the JLPT N2."); // JLPT N2の準備を頑張っていますね。
		}
	}
}