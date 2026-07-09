public class InterfaceDemo {

    public static void main(String[] args) {

        Trackable tracker1 = new CareerGoal(
                "Become a Java backend developer",
                7,
                "Example Tech");

        Trackable tracker2 = new LanguageGoal(
                "Pass the JLPT N2",
                5,
                "Japanese");

        tracker1.trackProgress();

        tracker2.trackProgress();
    }
}