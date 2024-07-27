import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inpuScanner = new Scanner(System.in);

        System.out.println("Enter A Year: ");
        int year = inpuScanner.nextInt();

        inpuScanner.close();

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("The Year is Leap Year: " + year);
        }else{
            System.out.println("The Year is not Leap Year: " + year);
        }
    }
    
}
