import java.util.Scanner;

public class BMICalculator {
    public static void main (String[] args){
        double height;
        int weight;
        double BMI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in m:");
        height = sc.nextDouble();
        System.out.print("Enter the weight:");
        weight = sc.nextInt();

        BMI = weight / Math.pow(height,2);
        
        System.out.println("--------------------------------");
        System.out.println("The BMI is " + BMI);
        System.out.println("--------------------------------");
    }
}