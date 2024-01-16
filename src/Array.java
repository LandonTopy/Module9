import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] dataPoints = new int[100];
        int sum = 0;
        int max = 0;
        int min = 100;


        for (int c = 0; c < dataPoints.length; c++) {
            int x = rand.nextInt(100) + 1;
            dataPoints[c] = x;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " ");
        }
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if(max < dataPoints[i]){
                max = dataPoints[i];
            }
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if(min > dataPoints[i]){
                min = dataPoints[i];
            }
        }
        System.out.println("\nThe sum is : " + sum);
        System.out.println("The average is : " + (double)sum/100);
        System.out.println("The biggest number is : " + max);
        System.out.println("The smallest number is : " + min);

        int value = InputHelper.getRangedInt(scan,"Please enter a number between 1-100", 1,100);
        int count = 0;
        boolean done = true;

        for (int i = 0; i < dataPoints.length; i++) {
            if(value == dataPoints[i]){
                count++;
            }
        }
            System.out.println(value + " was found " + count + " times in the array.");
        value = InputHelper.getRangedInt(scan,"Please enter a number between 1-100", 1,100);
        for (int i = 0; i < dataPoints.length; i++) {
            if(value == dataPoints[i]){
                System.out.println("The value " + value + " was found at array index " + i);
                System.exit(0);
            }
        }
        System.out.println("The value " + value + " was not found in the array");

    }
}

