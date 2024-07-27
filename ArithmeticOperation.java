import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.println("Enter Second Number: ");
        int secondNumber = inputScanner.nextInt();

        inputScanner.close();

        System.out.println("The Addition of the Number: " + (firstNumber+secondNumber));


        System.out.println("The Subtraction of the Number: " + (firstNumber - secondNumber));



        System.out.println("The Multiplication of the Number: " + (firstNumber * secondNumber));


        System.out.println("The Division of the Number: " + (firstNumber / secondNumber));

        System.out.println("The Modulus of the Number: " + (firstNumber % secondNumber));
    }
    
}
