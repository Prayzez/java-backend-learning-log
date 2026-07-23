public class JobApplication {
    private String companyName;

    private ApplicationStatus status;

    public JobApplication(String companyName, ApplicationStatus status) {
        this.companyName = companyName;
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ApplicationStatus getStatus() {
        return status;
    }
}