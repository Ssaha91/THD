package intermidiateJava;

public class ExceptionHandle {
    public static void main(String[] args) {
        int a = 0;
        int b = 6;

        try {
            int c = b/a;
            System.out.println(c);

        }
        catch (ArithmeticException e){
            System.out.println(" Cannot dive by  Zero" );
        }
    }
}
