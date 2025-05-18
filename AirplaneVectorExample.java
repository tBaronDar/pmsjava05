import java.util.ArrayList;

public class AirplaneVectorExample {
    public static void main(String[] args) {
        // Δημιουργία λίστας επιβατών
        ArrayList<String> passengers = new ArrayList<>();

        // Προσθήκη επιβατών
        for (int i = 0; i < 15; i++) {
            passengers.add("Passenger_" + (i + 1));
        }

        // Προσθήκη αποσκευών στις 3 τελευταίες σειρές
        passengers.add("Bag_1");
        passengers.add("Bag_2");
        passengers.add("Bag_3");

        System.out.println("Αρχική διαμόρφωση:");
        printLayout(passengers);

        // Θέση 6: αλλαγή επιβάτη με τον Bill
        passengers.set(5, "Bill");

        // Ο προηγούμενος διαγράφεται (π.χ. προσποιούμαστε διαμαρτυρία)

        // Τελευταίος επιβάτης (πιθανώς μεθυσμένος) αφαιρείται
        passengers.remove(passengers.size() - 1);

        System.out.println("\nΤελική διαμόρφωση:");
        printLayout(passengers);
    }

    // Βοηθητική μέθοδος εκτύπωσης θέσεων
    public static void printLayout(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Θέση " + (i + 1) + ": " + list.get(i));
        }
    }
}