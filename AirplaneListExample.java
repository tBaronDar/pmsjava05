import java.util.LinkedList;
import java.util.Collections;

public class AirplaneListExample {
    public static void main(String[] args) {
        LinkedList<String> passengers = new LinkedList<>();

        // Προσθήκη επιβατών
        passengers.add("std_1");
        passengers.add("std_2");
        passengers.add("std_3");

        // VIP στο μπροστινό μέρος
        passengers.addFirst("vip_1");
        passengers.addFirst("vip_2");

        // Αποσκευές στο τέλος
        passengers.addLast("bag_1");
        passengers.addLast("bag_2");

        System.out.println("Αρχική λίστα:");
        printList(passengers);

        // Αφαιρούμε τις αποσκευές με removeIf
        passengers.removeIf(s -> s.startsWith("bag"));

        // Ταξινομούμε τους επιβάτες αλφαβητικά
        Collections.sort(passengers);

        System.out.println("\nΜετά από επεξεργασία:");
        printList(passengers);
    }

    public static void printList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Θέση " + (i + 1) + ": " + list.get(i));
        }
    }
}