import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the first number");
        double number1 = input.nextDouble();
        System.out.println("ENter the second number");
        double number2 = input.nextDouble();
        System.out.println("Sum: "+addMethod(number1,number2));
        System.out.println("Subtract: "+subtractMethod(number1,number2));

    }

    public static double addMethod(double a, double b){
        return a+b;
    }
    public static double subtractMethod(double a, double b){
        return a-b;
    }
}
