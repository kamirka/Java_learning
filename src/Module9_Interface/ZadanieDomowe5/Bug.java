package Module9_Interface.ZadanieDomowe5;

public class Bug implements ConsoleNotification {
    private String bugDescription;
    private int bugPriority;
    private String bugStatus;
    private BugReporter bugReporter;


    public Bug(String bugDescription, int bugPriority, BugReporter bugReporter) {
        this.bugDescription = bugDescription;
        this.bugPriority = bugPriority;
        this.bugReporter = bugReporter;
        this.bugStatus = "Zamknięty";

    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description must have at least 10 signs");
        } else {
            this.bugDescription = bugDescription; //nie może być krótszy niż 10 znaków
        }
    }


    public void setBugPriority(int bugPriority) {
        if ((bugPriority < 1) || (bugPriority > 5)) {
            System.out.println("Priority must be between 1-5");
        } else {
            this.bugPriority = bugPriority;
        }

    }
    public int getBugPriority() {
        return bugPriority;
    }


    public void setBugStatus(String bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }



    public void getBugStatus() {
        if (bugStatus == "Otwarty" || bugStatus == "Zamknięty") {
            System.out.println("Status: " + bugStatus);
        } else {
            System.out.println("Dostępne statusy to: Otwarty lub Zamknięty. Sprawdź wprowadzoną wartość.");
        }
    }

    public void showBugStatus(){
        System.out.println("Bug status: "+bugStatus);
    }


    @Override
    public void notifyStatusChange() {
        System.out.println("Status has changed!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus='" + bugStatus + '\'' +
                ", bugReporter=" + bugReporter +
                '}';
    }
}
