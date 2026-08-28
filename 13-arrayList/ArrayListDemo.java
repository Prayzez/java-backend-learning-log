import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<JobApplication> applications = new ArrayList<>();

        JobApplication application1 = new JobApplication("Example Tech", ApplicationStatus.APPLIED);
        JobApplication application2 = new JobApplication("Future Systems", ApplicationStatus.INTERVIEW);
        JobApplication application3 = new JobApplication("ClosedAI", ApplicationStatus.OFFER);

        applications.add(application1);
        applications.add(application2);
        applications.add(application3);

        System.out.println("Total Applications: " + applications.size());

        for (int i = 0; i < applications.size(); i++) {
            JobApplication application = applications.get(i);
            ApplicationStatus status = application.getStatus();
            String message;
            if (status == ApplicationStatus.INTERVIEW) {
                message = "You got this! Prepare carefully and don't be nervous, be yourself.";
            } else if (status == ApplicationStatus.OFFER) {
                message = "Congratulations! I knew you could do it.";
            } else if (status == ApplicationStatus.APPLIED) {
                message = "Be patient, a positive reply will surely arrive soon.";
            } else {
                message = "Don't give up! An arrow also gets pulled back before flying forward.";
            }
            System.out.println("Company: " + application.getCompanyName());
            System.out.println("Status: " + status);
            System.out.println(message);
            System.out.println();
        }
    }
}