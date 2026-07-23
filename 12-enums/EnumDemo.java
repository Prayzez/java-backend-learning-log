public class EnumDemo {
    public static void main(String[] args) {

        JobApplication application1 = new JobApplication("Example Tech", ApplicationStatus.APPLIED);
        JobApplication application2 = new JobApplication("Future Systems", ApplicationStatus.INTERVIEW);

        printApplication(application1);
        printApplication(application2);
    }

    public static void printApplication(JobApplication application) {
        ApplicationStatus status = application.getStatus();
        System.out.println("Company: " + application.getCompanyName());
        System.out.println("Status: " + status);
        if (status == ApplicationStatus.INTERVIEW) {
            System.out.println("You got this! Prepare carefully and don't be nervous, be yourself.");
        } else if (status == ApplicationStatus.OFFER) {
            System.out.println("Congratulations! I knew you could do it.");
        } else if (status == ApplicationStatus.APPLIED) {
            System.out.println("Be patient, a positive reply will surely arrive soon.");
        } else {
            System.out.println("Don't give up! An arrow also gets pulled back before flying forward.");
        }
    }
}