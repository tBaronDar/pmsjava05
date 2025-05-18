public class StringBasics {
    public static void main(String[] args) {
        String message = "Hello, Java!";
        System.out.println("Το string είναι: " + message);
        System.out.println("Μήκος: " + message.length());

        if (message.isEmpty()) {
            System.out.println("Το string είναι κενό.");
        } else {
            System.out.println("Το string ΔΕΝ είναι κενό.");
        }

        // Πρόσβαση σε μεμονωμένους χαρακτήρες
        System.out.println("Ο πρώτος χαρακτήρας είναι το: " + message.charAt(0));
        System.out.println("Ο τελευταίος χαρακτήρας είναι το: " + message.charAt(message.length() - 1));

        // "Καθαρισμός" του string
        message = "";
        System.out.println("Μετά το καθάρισμα:");
        System.out.println("Μήκος: " + message.length());
        System.out.println("Είναι κενό; " + message.isEmpty());
    }
}
