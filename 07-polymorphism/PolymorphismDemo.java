public class PolymorphismDemo {

    public static void main(String[] args) {
        Goal goal1 = new CareerGoal("Become a Java backend developer",
                7,
                "Example Tech");

        Goal goal2 = new LanguageGoal("Pass the JLPT N2 level", 5, "Japanese");

        System.out.println("Goal Name: " + goal1.getGoalName());
        System.out.println("Target Months: " + goal1.getTargetMonths());
        // The following would not compile because goal1 is of type Goal:
        // goal1.getTargetCompany();

        System.out.println("Goal Name: " + goal2.getGoalName());
        System.out.println("Target Months: " + goal2.getTargetMonths());
        // The following would not compile because goal2 is of type Goal:
        // goal2.getLanguage();
    }
}