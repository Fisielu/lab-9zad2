public class WorkHoursChecker {
    private static int REQUIRED_HOURS = 160;

    public static void checkHours(int hours) throws InsufficientHoursException {
        if (hours < REQUIRED_HOURS) {
            throw new InsufficientHoursException(
                    "Przepracowałeś tylko " + hours + " godzin, a wymagane jest co najmniej " + REQUIRED_HOURS + " godzin."
            );
        }
    }

    public static void main(String[] args) {
        try {
            int workedHours = 140;
            checkHours(workedHours);
            System.out.println("Przepracowałeś wystarczającą liczbę godzin.");
        } catch (InsufficientHoursException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}