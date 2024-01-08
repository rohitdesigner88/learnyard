import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetCount = sc.nextInt();
        int targetSum = sc.nextInt();
        int currentNum = 1, count = 0;

        while(count < targetCount){
            int sum = 0;
            for(int num = currentNum; num>0; num/=10)
                sum += num%10;

            if(sum == targetSum){
                System.out.println(currentNum);
                count++;
            }

            currentNum++;
        }
        

        //start from 1.
        //keep checking the sum of digit

        //when we find digit sum === target sum
        //print it
        //count++

        sc.close();
    }
}
