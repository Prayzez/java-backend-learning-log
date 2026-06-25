import java.util.Scanner;

public class StudyPaceAdvisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your weekly study hours: "); // 週平均学習時間を入力してください：
		double weeklyHours = scanner.nextDouble();
		
		System.out.print("Enter the number of months you plan to study: "); // 何か月勉強する予定か入力してください：
		int studyMonths = scanner.nextInt();
		
		System.out.println();
		System.out.println("Study Plan Summary"); // 学習計画のまとめ
		System.out.println("Weekly study hours: " + weeklyHours); // 週平均学習時間：
		System.out.println("Planned study months: " + studyMonths); // 予定している学習月数：
		
		if (weeklyHours >= 25) {
			System.out.println("Very intensive study pace."); // とても集中的な学習ペースです。
		} else if (weeklyHours >= 15) {
			System.out.println("Strong study pace."); // しっかりした学習ペースです。
		} else if (weeklyHours >= 8) {
			System.out.println("Moderate study pace."); // 標準的な学習ペースです。
		} else {
			System.out.println("Light study pace. You may need to study more hours."); // 軽めの学習ペースです。学習時間を増やす必要があるかもしれません。
		}
		
		if (studyMonths >= 7) {
			System.out.println("You have a good amount of time."); // 十分な時間があります。
		} else if (studyMonths >= 4) {
			System.out.println("You need a focused plan."); // 集中的な計画が必要です。
		} else {
			System.out.println("You need a very intensive study plan."); // とても集中的な学習計画が必要です。
		}
	}
}