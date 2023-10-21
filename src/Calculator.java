import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean c = true;

        while (c) {
            System.out.println("Input a =");
            int a = s.nextInt();
            System.out.println("Input b =");
            double b = s.nextDouble();
            s.nextLine();
            System.out.println("Input operation : 1-(+),2-(-),3-(*),4-(/),0-exit");
            String operation = s.nextLine();

            switch (operation) {

                case "1":
                    System.out.println("sum a+b = " + (a + (int) b));
                    break;
                case "2":
                    System.out.println("difference a-b = " + (a - (int) b));
                    break;
                case "3":
                    System.out.println("product a*b = " + (a * (int) b));
                    break;
                case "4":
                    System.out.println("division a/b = " + (a / b));
                    break;
                case "0":
                    c = false;
                    break;
                default:
                    System.out.println("You enter wrong operation. Try again.");
                    break;
            }
        }

    }
}


