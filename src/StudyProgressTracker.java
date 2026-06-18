import java.util.Scanner;

public class StudyProgressTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many weeks will you study? "); // 何週間勉強しますか？
		int weeks = scanner.nextInt();

		for (int i = 1; i <= weeks; i++) {
			System.out.println("Week " + i + " completed."); // 第○週が完了しました。
		}

		System.out.print("How many hours do you study each week? "); // 毎週何時間勉強しますか？
		double weeklyHours = scanner.nextDouble();

		double totalHours = weeks * weeklyHours;

		System.out.println();
		System.out.println("Study Progress Summary"); // 学習進捗のまとめ
		System.out.println("Estimated total study hours: " + totalHours); // 推定総学習時間：

		int countdown = 5;

		while (countdown > 0) {
			System.out.println("Keep going! " + countdown); // 頑張ろう！
			countdown--;
		}

		System.out.println("Goal reached!"); // 目標達成！
	}
}