package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

public class Prime_Num_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Starting Range...");

        int st = s.nextInt();

        System.out.println("Enter the Ending Range...");

        int end = s.nextInt();
        int sum=0;
        for (int i = st; i <= end; i++) {
            int n = i;
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0)
                    count++;
            }
            if (count == 2)
               sum +=n;
        }
        System.out.print("Sum of prime number is:"+sum);
    }
}
