import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumNatural = 0;

        sumNatural = n*(n+1)/2;

        System.out.println("Sum of natural "+sumNatural);
        

        sc.close();
    }
}
