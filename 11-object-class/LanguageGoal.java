public class LanguageGoal extends Goal {
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
    public String toString() {
        return "Language Goal\n" +
                "Goal Name: " + getGoalName() + "\n" +
                "Target Months: " + getTargetMonths() + "\n" +
                "Language: " + getLanguage();
    }
}