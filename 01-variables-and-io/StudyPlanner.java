import java.util.Scanner;

public class StudyPlanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your nickname: "); //名前を入力してください：
		String nickname = scanner.nextLine();
		
		System.out.print("Enter your target job: "); //目指している仕事を入力してください：
		String targetJob = scanner.nextLine();
		
		System.out.print("Enter the predicted study months: "); //予想される学習月数を入力してください：
		int studyMonths = scanner.nextInt();
		
		System.out.print("Enter the average study hours you are putting in every week: "); //毎週平均して何時間勉強しているか入力してください：
		double weeklyHours = scanner.nextDouble();
		
		double totalStudyHours = studyMonths * 4 * weeklyHours;
		
		System.out.println(); //Extra line to improve readability 読みやすさを向上させるための追加行
		System.out.println("Study Plan Summary");
		System.out.println("Nickname: " + nickname);
		System.out.println("ニックネーム: " + nickname);
		System.out.println("Target Job: " + targetJob);
		System.out.println("目指している仕事: " + targetJob);
		System.out.println("Study months: " + studyMonths);
		System.out.println("学習月数: " + studyMonths);
		System.out.println("Average weekly study hours: " + weeklyHours);
		System.out.println("週平均学習時間: " + weeklyHours);
		System.out.println("Total study hours: " + totalStudyHours);
		System.out.println("総学習時間: " + totalStudyHours);

	}

}
