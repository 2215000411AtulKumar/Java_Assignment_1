import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int isBostonNumber = isBoston(N);
        
        System.out.println(isBostonNumber);
        
        scanner.close();
    }

    public static int isBoston(int N) {
        int sumOfDigits = 0;
        
       
        int originalN = N;
        while (N > 0) {
            sumOfDigits += N % 10;
            N /= 10;
        }
        
       
        for (int i = 2; i <= Math.sqrt(originalN); i++) {
            while (originalN % i == 0) {
                int primeFactor = i;
                while (primeFactor > 0) {
                    sumOfDigits -= primeFactor % 10;
                    primeFactor /= 10;
                }
                originalN /= i;
            }
        }
        
   
        if (originalN > 1) {
            while (originalN > 0) {
                sumOfDigits -= originalN % 10;
                originalN /= 10;
            }
        }
        

        return sumOfDigits == 0 ? 1 : 0;
    }
}