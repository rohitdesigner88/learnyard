import java.util.Scanner;

public class Digit {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        

        int digit = 0;
        int lastDigit = 0;
        int sum = 0;
        for(int i = n;i>0;i=i/10){
            lastDigit = i % 10;
            sum = sum + lastDigit;
            digit++;
        }
        System.out.println("Total Digit is: "+digit);
        System.out.println("Sum of Digit is: "+sum);
       
        
    sc.close();
    }
    
}
