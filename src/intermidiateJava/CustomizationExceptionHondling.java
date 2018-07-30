package intermidiateJava;

import java.util.Scanner;

public class CustomizationExceptionHondling {
    public static void main(String[] args) {
        double payment = 0;
        boolean positivePayment = true;

        do {
            System.out.print("Enter the amount : ");
            Scanner scanner = new Scanner(System.in);
            try {
                payment = scanner.nextDouble();
                if (payment < 0){
                    throw new NegativePaymentException(payment);
                }else
                    positivePayment=true;
            }catch (NegativePaymentException e){
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePayment = false;
            }
        } while (!positivePayment);

        System.out.println("Thank you for your payment $"+ payment);



    }
}
