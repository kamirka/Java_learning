package Module3_ClassesAndObjects.ZadanieDomowe2;

public class Bug {
    String bugDescription;
    String reporterEmailAddress;
    int bugPriority;
    String bugStatus;

    Bug(String bugDescription, String reporterEmailAddress, int bugPriority){
        this.bugDescription = bugDescription;
        this.reporterEmailAddress = reporterEmailAddress;
        this.bugPriority = bugPriority;
        this.bugStatus = "Zamknięty";
    }

    void getAllInfo(){
        System.out.println("Opis błędu: "+bugDescription);
        System.out.println("Email osoby zgłaszającej błąd: "+reporterEmailAddress);
        System.out.println("Priorytet błędu:  "+bugPriority);
        System.out.println("Status błędu: "+bugStatus);
        System.out.println("------------------------------------");
    }

    void getReporterEmailAddress(){
        System.out.println("Email: " + reporterEmailAddress);
    }

    void getBugStatus() {
        if (bugStatus == "Otwarty" || bugStatus == "Zamknięty") {
            System.out.println("Status: "+bugStatus);
        } else {
            System.out.println("Dostępne statusy to: Otwarty lub Zamknięty. Sprawdź wprowadzoną wartość.");
        }
    }

    int getBugPriority(){
        if(bugPriority>=1 && bugPriority <=5){
            return bugPriority;
        }else{
            return 1;
        }
    }

}
