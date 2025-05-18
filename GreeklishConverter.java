/*
 * Μην αλλάξετε τον κορμό της δομής (main και convertChar).
 * Συμπληρώστε το switch με τις αντιστοιχίες.
 * Εναλλακτικά, μπορείτε να χρησιμοποιήσετε if-else αντί για switch.
 */

public class GreeklishConverter {

    public static void main(String[] args) {
        // TODO: Ορίστε μια μεταβλητή τύπου String που περιέχει ελληνικό κείμενο
        String greekText = ""; // π.χ. "Καλημέρα σας! Πώς είστε σήμερα;"

        // TODO: Δημιουργήστε ένα StringBuilder για τη μετατροπή σε greeklish
        StringBuilder greeklish = new StringBuilder();

        // TODO: Επαναλάβετε για κάθε χαρακτήρα του ελληνικού κειμένου
        for (int i = 0; i < greekText.length(); i++) {
            // TODO: Πάρτε τον χαρακτήρα στη θέση i
            char ch = greekText.charAt(i);

            // TODO: Καλέστε τη μέθοδο convertChar και προσθέστε το αποτέλεσμα στο greeklish
            greeklish.append(convertChar(ch));
        }

        // TODO: Εκτυπώστε το αρχικό και το μεταφρασμένο κείμενο
        System.out.println("Αρχικό: " + greekText);
        System.out.println("Greeklish: " + greeklish.toString());

        // TODO: Εκτυπώστε το μήκος του κάθε string
        System.out.println("Μήκος αρχικού: " + greekText.length());
        System.out.println("Μήκος Greeklish: " + greeklish.length());
    }

    /**
     * Η μέθοδος αυτή δέχεται έναν ελληνικό χαρακτήρα και επιστρέφει το αντίστοιχο greeklish.
     * Αν δεν είναι ελληνικός, επιστρέφεται όπως είναι.
     */
    public static String convertChar(char ch) {
        // TODO: Χρησιμοποιήστε switch-case ή if για να αντιστοιχίσετε τους χαρακτήρες
        // Παράδειγμα:
        // αν ch είναι 'α' ή 'ά', επιστρέψτε "a"
        // αν ch είναι 'β', επιστρέψτε "b"
        // αν δεν αντιστοιχεί, επιστρέψτε τον ίδιο χαρακτήρα ως String
        switch (Character.toLowerCase(ch)) {
            // TODO: Προσθέστε περιπτώσεις χαρακτήρων π.χ.:
            // case 'α': case 'ά': return "a";
            // case 'ε': case 'έ': return "e";
            // ...

            default:
                return String.valueOf(ch); // επιστρέφει χαρακτήρες όπως κενά, στίξη, κλπ.
        }
    }
}
