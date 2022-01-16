package Module9_Interface.ZadanieDomowe5;

public class MainApp {
    public static void main(String[] args) {


        BugReporter bugReporter = new BugReporter("Mira","Testowa","mk@wp.pl");

        Bug bug = new Bug("Bug Description", 2, bugReporter);

        System.out.println(bug);
        bug.setBugStatus("Otwarty");
        System.out.println(bug);
    }
}
