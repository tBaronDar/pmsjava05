public class StringSearch {
    public static void main(String[] args) {
        // ---- Τμήμα Κώδικα 1
        String text = "Η γρήγορη καφέ αλεπού πηδάει πάνω από τον τεμπέλη σκύλο.";

        int pos1 = text.indexOf("αλεπού");
        System.out.println("Η λέξη 'αλεπού' εμφανίζεται στη θέση: " + pos1);

        int pos2 = text.lastIndexOf("ο");
        System.out.println("Τελευταία εμφάνιση του 'ο' στη θέση: " + pos2);

        String sub = text.substring(3, 10);
        System.out.println("Υποσυμβολοσειρά από θέση 3 έως 10: " + sub);

        // ---- Τμήμα Κώδικα 2 – equals, equalsIgnoreCase, compareTo
        String s1 = "Καλημέρα";
        String s2 = "καλημέρα";
        String s3 = "Καλησπέρα";

        System.out.println("Ίσα (με διάκριση πεζών/κεφαλαίων); " + s1.equals(s2));
        System.out.println("Ίσα (χωρίς διάκριση); " + s1.equalsIgnoreCase(s2));

        int comp1 = s1.compareTo(s3);
        System.out.println("compareTo (Καλημέρα vs Καλησπέρα): " + comp1);
        // Αν comp1 < 0, τότε s1 < s3


        // ---- Τμήμα Κώδικα 3 – Εύρεση πρώτου χαρακτήρα εκτός συνόλου
        String phrase = "   Hello world";
        int index = -1;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                index = i;
                break;
            }
        }
        System.out.println("Πρώτος μη κενός χαρακτήρας στη θέση: " + index);

    }
}
