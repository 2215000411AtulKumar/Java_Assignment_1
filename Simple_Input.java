import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum =0, num;
		while(sum>=0)
		{
			num = sc.nextInt();
			sum+=num;
			if(sum>=0)
				System.out.println(num);
			else
				break;	
		}
    }
}