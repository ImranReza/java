import java.util.Scanner;

public class StarPatternTwo {
    public static void main(String[] args) {
        Scanner inpuScanner = new Scanner(System.in);

        System.out.println("Enter A Number : ");
        
        int n = inpuScanner.nextInt();
        inpuScanner.close();

        //logic 
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
