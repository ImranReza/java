import java.util.Scanner;

public class StarDimondProgram {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = inputScanner.nextInt();

        inputScanner.close();

        //dimond logic
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // reverse piramid
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n-i;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
