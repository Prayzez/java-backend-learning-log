public class ObjectDemo {

    public static void main(String[] args) {

        CareerGoal goal = new CareerGoal(
                "Become a Java backend developer",
                7,
                "Example Tech");

        System.out.println(goal);

        LanguageGoal languageGoal = new LanguageGoal("Pass the JLPT N2",
                5,
                "Japanese");

        System.out.println(languageGoal);
    }

}