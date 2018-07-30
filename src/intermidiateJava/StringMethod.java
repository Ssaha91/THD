package intermidiateJava;

public class StringMethod {
    public static void main(String[] args) {
        String[] words = {"Mou", "Moumita", "MouRani", "Gadhi"};

        for (String x : words) {
            if (x.startsWith("Mo")) {
                System.out.println(x);

            }
        }
    }
}