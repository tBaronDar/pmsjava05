import java.util.Deque;
import java.util.LinkedList;

public class AirplaneDequeExample {
    public static void main(String[] args) {
        // Χρήση LinkedList ως Deque
        Deque<String> configuration = new LinkedList<>();

        // Προσθήκη VIP επιβατών στην αρχή
        configuration.addFirst("vip_1");
        configuration.addFirst("vip_2");
        configuration.addFirst("vip_3");

        // Προσθήκη standard επιβατών στη μέση
        configuration.add("std_1");
        configuration.add("std_2");
        configuration.add("std_3");

        // Προσθήκη αποσκευών στο τέλος
        configuration.addLast("bag_1");
        configuration.addLast("bag_2");

        // Εκτύπωση σύνθεσης
        printConfiguration(configuration);

        // Αφαίρεση VIP από μπροστά (ακυρώνει πτήση)
        configuration.removeFirst();

        // Αφαίρεση αποσκευής από πίσω
        configuration.removeLast();

        System.out.println("\nΜετά από αλλαγές:");
        printConfiguration(configuration);
    }

    public static void printConfiguration(Deque<String> deque) {
        int index = 1;
        for (String item : deque) {
            System.out.println("Θέση " + index++ + ": " + item);
        }
    }
}