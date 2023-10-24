import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean c = true;

        while (c) {

            System.out.println("Input a =");
            int a = s.nextInt();
            System.out.println("Input b =");
            int b = s.nextInt();
            s.nextLine();
            System.out.println("Input operation : 1-(+),2-(-),3-(*),4-(/),0-exit");
            String operation = s.nextLine();

            switch (operation) {
                case "1":
                    sum(a, b);
                    break;
                case "2":
                    dif(a, b);
                    break;
                case "3":
                    multi(a, b);
                    break;
                case "4":
                    div(a, b);
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

    public static void sum(int a, int b) {
        System.out.println("sum a+b = " + (a + b));
    }

    public static void dif(int a, int b) {
        System.out.println("difference a-b = " + (a - b));
    }

    public static void multi(int a, int b) {
        System.out.println("multiplication a*b = " + (a * b));
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR!!! , b=0");
        }
         else {
            System.out.println("division a/b = " + (a / (double)b));
        }

    }
}







