public class LanguageGoal extends Goal implements Trackable {
    private String language;

    public LanguageGoal(String goalName, int targetMonths, String language) {
        super(goalName, targetMonths);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void displayGoal() {
        System.out.println("Language Goal");
        System.out.println("Goal Name: " + getGoalName());
        System.out.println("Target Months: " + getTargetMonths());
        System.out.println("Language: " + getLanguage());
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking language learning progress...");
    }
}