import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        boolean isArmstrong = isArmstrongNumber(number);
        
        System.out.println(isArmstrong);
        
        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}