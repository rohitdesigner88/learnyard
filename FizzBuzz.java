import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1;i<=n;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else{
                System.out.println(i);
                sum = sum + i;
                System.out.println("SUM is "+sum);
                if(sum>3*n)
                break;
            }
        }

        sc.close();        
    }
}
