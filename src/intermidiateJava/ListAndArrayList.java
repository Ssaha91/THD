package intermidiateJava;

import java.util.Scanner;

public class ListAndArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 Integers: ");
        getInpu();
        pritArray(baseData);
        resizeArray();


        baseData[10]= 33;
        baseData[11] = 44;
        pritArray(baseData);
    }

    public static void getInpu(){
        for (int i = 0; i<baseData.length; i++){
            baseData[i]=scanner.nextInt();
        }
    }

    public static void pritArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(baseData[i]);
        }

    }

    public static void resizeArray(){
        int[] orginal = baseData;

        baseData = new int[12];
        for (int i = 0; i<orginal.length; i++){
            baseData[i] = orginal[i];
        }


    }
}
