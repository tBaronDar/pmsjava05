/*
 * Μην αλλάξετε τον κορμό της δομής (main και convertChar).
 * Συμπληρώστε το switch με τις αντιστοιχίες.
 * Εναλλακτικά, μπορείτε να χρησιμοποιήσετε if-else αντί για switch.
 */

public class GreeklishConverter {

    public static void main(String[] args) {
        // TODO: Ορίστε μια μεταβλητή τύπου String που περιέχει ελληνικό κείμενο
        String greekText = "Καλημέρα σας! Πώς είστε σήμερα;"; // π.χ. "Καλημέρα σας! Πώς είστε σήμερα;"

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
        return switch (Character.toLowerCase(ch)) {
            // TODO: Προσθέστε περιπτώσεις χαρακτήρων π.χ.:
            case 'α', 'ά', 'Α', 'Ά' -> "a";
            case 'β', 'Β' -> "v";
            case 'γ', 'Γ' -> "g";
            case 'δ', 'Δ' -> "d";
            case 'ε', 'έ', 'Ε', 'Έ' -> "e";
            case 'ζ', 'Ζ' -> "z";
            case 'η', 'ή', 'Η', 'Ή' -> "i";
            case 'θ', 'Θ' -> "th";
            case 'ι', 'ί', 'ϊ', 'ΐ', 'Ι', 'Ί', 'Ϊ' -> "i";
            case 'κ', 'Κ' -> "k";
            case 'λ', 'Λ' -> "l";
            case 'μ', 'Μ' -> "m";
            case 'ν', 'Ν' -> "n";
            case 'ξ', 'Ξ' -> "x";
            case 'ο', 'ό', 'Ο', 'Ό' -> "o";
            case 'π', 'Π' -> "p";
            case 'ρ', 'Ρ' -> "r";
            case 'σ', 'ς', 'Σ' -> "s";
            case 'τ', 'Τ' -> "t";
            case 'υ', 'ύ', 'ϋ', 'ΰ', 'Υ', 'Ύ', 'Ϋ' -> "y";
            case 'φ', 'Φ' -> "f";
            case 'χ', 'Χ' -> "ch";
            case 'ψ', 'Ψ' -> "ps";
            case 'ω', 'ώ', 'Ω', 'Ώ' -> "o";


            default -> String.valueOf(ch); // επιστρέφει χαρακτήρες όπως κενά, στίξη, κλπ.
        };
    }
}
