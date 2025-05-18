public class StringModification {
    public static void main(String[] args) {
        // ---- Τμήμα Κώδικα 1
        String s1 = "Καλημέρα";
        String s2 = " κόσμε!";
        String s3 = s1 + s2;

        System.out.println("Συνένωση με +: " + s3);

        s1 += " σε όλους!";
        System.out.println("Με +=: " + s1);

        String s4 = s1.concat(" Καλώς ήρθατε.");
        System.out.println("Με concat: " + s4);

        // ---- Τμήμα Κώδικα 2
        String original = "Καληνύχτα κόσμε";
        String replaced = original.replace("Καληνύχτα", "Καλημέρα");
        System.out.println("Μετά το replace: " + replaced);

        String replacedChar = replaced.replace('ε', '3');
        System.out.println("Αντικατάσταση χαρακτήρα: " + replacedChar);

        // ---- Τμήμα Κώδικα 3 – "Insert", "Erase", "Pop back"
        String base = "HelloWorld";
        // Προσθήκη στη μέση (insert στη θέση 5)
        String inserted = base.substring(0, 5) + " Java " + base.substring(5);
        System.out.println("Μετά από 'insert': " + inserted);

        // Αφαίρεση χαρακτήρων (erase 5 χαρακτήρες από θέση 5)
        String erased = inserted.substring(0, 5) + inserted.substring(10);
        System.out.println("Μετά από 'erase': " + erased);

        // "pop_back"
        String popped = erased.substring(0, erased.length() - 1);
        System.out.println("Μετά από 'pop_back': " + popped);
    }
}
