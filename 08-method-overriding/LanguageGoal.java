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
        super.displayGoal();
        System.out.println("Language: " + getLanguage());
    }
}