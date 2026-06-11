
public class StudyProfile {

	public static void main(String[] args) {
		String nickname = "K";
		String targetJob = "Working as an engineer who makes a positive impact on society";
		String targetJobJP = "社会に良い影響を与えるエンジニアとして働く";
		int studyMonths = 7;
		double weeklyHours = 20.5;
		boolean preparingForN2 = true;
		
		System.out.println("Nickname: " + nickname);
		System.out.println("ニックネーム: " + nickname);
		System.out.println("Target Job: " + targetJob);
		System.out.println("目指している仕事: " + targetJobJP);
		System.out.println("Study months: " + studyMonths);
		System.out.println("学習月数: " + studyMonths);
		System.out.println("Average weekly study hours: " + weeklyHours);
		System.out.println("週平均学習時間: " + weeklyHours);
		System.out.println("Preparing for the JLPT N2: " + preparingForN2);
		System.out.println("JLPT N2の準備: " + preparingForN2);
		
		double totalStudyHours = studyMonths * 4 * weeklyHours;
		System.out.println("Total study hours: " + totalStudyHours);
		System.out.println("総学習時間: " + totalStudyHours);
	}

}
