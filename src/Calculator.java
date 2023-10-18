import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input a=");
        int a = s.nextInt();
        System.out.println("Input b=");
        double b = s.nextDouble();
        double sum = a + b;
        double dif = a - b;
        double multi = a * b;
        double div = a / b;
        System.out.printf("Sum = %f, difference = %f, multiplication = %f, division = %f",sum,dif,multi,div);
    }
}
