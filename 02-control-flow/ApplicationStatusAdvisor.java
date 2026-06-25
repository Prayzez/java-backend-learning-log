import java.util.Scanner;

public class ApplicationStatusAdvisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter company name: "); // 会社名を入力してください：
		String companyName = scanner.nextLine();
		
		System.out.print("Enter application status: "); // 応募状況を入力してください：
		String status = scanner.nextLine();
		
		System.out.print("Enter the number of days since applying: "); // 応募してから何日経ったか入力してください：
		int daysSinceApplying = scanner.nextInt();
		
		System.out.println();
		System.out.println("Application Status Summary"); // 応募状況のまとめ
		System.out.println("Company: " + companyName); // 会社名：
		System.out.println("Status: " + status); // 応募状況：
		System.out.println("Days since applying: " + daysSinceApplying); // 応募してからの日数：
		
		if (status.equalsIgnoreCase("applied")) {
			System.out.println("Application submitted. Keep tracking the result."); // 応募は完了しています。結果を引き続き確認しましょう。
		} else if (status.equalsIgnoreCase("interview")) {
			System.out.println("Prepare interview answers and review the company."); // 面接回答を準備し、会社について復習しましょう。
		} else if (status.equalsIgnoreCase("offer")) {
			System.out.println("Review the offer carefully before deciding."); // 決定する前に、オファー内容を慎重に確認しましょう。
		} else if (status.equalsIgnoreCase("rejected")) {
			System.out.println("Reflect on this application and improve for the next one."); // 今回の応募を振り返り、次回に向けて改善しましょう。
		} else {
			System.out.println("Unknown status. Please use applied, interview, offer, or rejected."); // 不明な応募状況です。applied、interview、offer、rejectedのいずれかを使用してください。
		}
		
		if (daysSinceApplying >= 14) {
			System.out.println("Consider sending a polite follow-up message."); // 丁寧なフォローアップメッセージを送ることを検討しましょう。
		} else {
			System.out.println("It may be better to wait a little longer before following up."); // フォローアップする前に、もう少し待った方がよいかもしれません。
		}
	}
}