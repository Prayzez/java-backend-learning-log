public class AbstractionDemo {

    public static void main(String[] args) {
        Goal goal1 = new CareerGoal("Become a Java backend developer",
                7,
                "Example Tech");

        Goal goal2 = new LanguageGoal("Pass the JLPT N2 level", 5, "Japanese");

        goal1.displayGoal();
        System.out.println();

        goal2.displayGoal();
    }
}