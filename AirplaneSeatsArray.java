public class AirplaneSeatsArray {
    public static void main(String[] args) {
        // Δημιουργία πίνακα 16 θέσεων
        String[] passengers = new String[16];

        // Ανάθεση τιμών (15 επιβάτες)
        for (int i = 0; i < 16; i++) {
            if (i == 12) {
                passengers[i] = null; // Θέση 13 κενή λόγω ασθενείας
            } else if (i < 15) {
                passengers[i] = "Passenger_" + (i + 1);
            }
        }

        // Έλεγχοι
        System.out.println("Μήκος πίνακα: " + passengers.length);
        System.out.println("Είναι άδειος; " + (passengers.length == 0));

        System.out.println("Πρώτος επιβάτης: " + passengers[0]);
        System.out.println("Τελευταίος επιβάτης: " + passengers[passengers.length - 1]);

        // Εκτύπωση όλων των επιβατών
        for (int i = 0; i < passengers.length; i++) {
            System.out.println("Θέση " + (i + 1) + ": " +
                    (passengers[i] != null ? passengers[i] : "Κενή"));
        }

        // Αντικατάσταση θέσης 13 (index 12) δύο φορές
        passengers[12] = "Replacement_1";
        passengers[12] = "Replacement_2";
        passengers[12] = null; // Τελικά μένει κενή


        // Αντικατάσταση με νέο αεροσκάφος (swap δύο arrays)
        String[] newPlane = new String[16];
        for (int i = 0; i < 16; i++) {
            newPlane[i] = passengers[i];
        }

        System.out.println("=== Νέο αεροπλάνο ===");
        for (int i = 0; i < newPlane.length; i++) {
            System.out.println("Θέση " + (i + 1) + ": " +
                    (newPlane[i] != null ? newPlane[i] : "Κενή"));
        }



    }
}
