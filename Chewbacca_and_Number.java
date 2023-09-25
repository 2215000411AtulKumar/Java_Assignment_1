import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        
        long result = minimizeNumber(x);
        
        System.out.println(result);
        
        scanner.close();
    }

    public static long minimizeNumber(long x) {
        char[] digits = Long.toString(x).toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0'; 
            if (digit >= 5) {
                digit = 9 - digit; 
                if (i == 0 && digit == 0) {
                    continue;
                }
                digits[i] = (char) (digit + '0'); 
            }
        }
        
        return Long.parseLong(new String(digits));
    }
}