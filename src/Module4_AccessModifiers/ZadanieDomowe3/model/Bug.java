package Module4_AccessModifiers.ZadanieDomowe3.model;

public class Bug {
    private String bugDescription;
    private String reporterEmailAddress;
    private int bugPriority;
    private String bugStatus;

    public Bug(String bugDescription, String reporterEmailAddress, int bugPriority) {
        this.bugDescription = bugDescription;
        this.reporterEmailAddress = reporterEmailAddress;
        this.bugPriority = bugPriority;
        this.bugStatus = "Zamknięty";
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

    public void setReporterEmailAddress(String reporterEmailAddress) {
        if (reporterEmailAddress.contains("@")) {
            this.reporterEmailAddress = reporterEmailAddress; //czy zawiera znak @
        } else {
            System.out.println("Check your email - it must contains @");
        }
    }

    public void setBugPriority(int bugPriority) {
        if ((bugPriority < 1) || (bugPriority > 5)) {
            System.out.println("Priority must be between 1-5");
        } else {
            this.bugPriority = bugPriority;
        }

    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void getAllInfo() {
        System.out.println("Opis błędu: " + bugDescription);
        System.out.println("Email osoby zgłaszającej błąd: " + reporterEmailAddress);
        System.out.println("Priorytet błędu:  " + bugPriority);
        System.out.println("Status błędu: " + bugStatus);
        System.out.println("------------------------------------");
    }

    public void getReporterEmailAddress() {
        System.out.println("Email: " + reporterEmailAddress);
    }

    public void getBugStatus() {
        if (bugStatus == "Otwarty" || bugStatus == "Zamknięty") {
            System.out.println("Status: " + bugStatus);
        } else {
            System.out.println("Dostępne statusy to: Otwarty lub Zamknięty. Sprawdź wprowadzoną wartość.");
        }
    }

    public int getBugPriority() {
return bugPriority;
    }
}
