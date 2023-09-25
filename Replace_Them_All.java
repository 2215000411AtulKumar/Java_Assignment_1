import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String nStr = Long.toString(n);
        nStr = nStr.replace('0', '5');
        long result = Long.parseLong(nStr);
        System.out.println(result);
    }
}
