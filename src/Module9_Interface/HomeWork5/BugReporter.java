package Module9_Interface.HomeWork5;

import java.util.Objects;

public class BugReporter {
    private String firstName;
    private String lastName;
    private String reporterEmailAddress;

    public BugReporter(String firstName, String lastName, String reporterEmailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reporterEmailAddress = reporterEmailAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReporterEmailAddress() {
        return reporterEmailAddress;
    }


    public void setReporterEmailAddress(String reporterEmailAddress) {
        if (reporterEmailAddress.contains("@")) {
            this.reporterEmailAddress = reporterEmailAddress; //czy zawiera znak @
        } else {
            System.out.println("Check your email - it must contains @");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(reporterEmailAddress, that.reporterEmailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, reporterEmailAddress);
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", reporterEmailAddress='" + reporterEmailAddress + '\'' +
                '}';
    }
}
