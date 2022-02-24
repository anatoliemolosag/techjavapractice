package EnesMentoring;

public class Practice1 {

    public static void main(String[] args) {

        int TotalMinutes = 43224424;

        int yearAsMinutes = 365 * 24 * 60;

        int daysAsMinutes = 24 * 60;

        int year = TotalMinutes / yearAsMinutes;

        int days = (TotalMinutes % yearAsMinutes) / daysAsMinutes;

        System.out.println(TotalMinutes + "  equals " + year + " yearsand " + days + " days");













    }
}
