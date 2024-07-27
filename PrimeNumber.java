import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int number = inputScanner.nextInt();

        inputScanner.close();

        int i;

        for(i=2;i<number;i++){
            if(number%i == 0){
                System.out.println("The Number is Not Prime Number: " + number);
                break;
            }
        }

        if(number == i){
            System.out.println("The Number is Prime Number: " + number);
        }
    }
    
}
