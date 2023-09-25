import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int prev=0, sum=0;
		int curr=1;
		for (int i=1; i<n; i++)
		{
			sum=prev+curr;
			prev=curr;
			curr=sum;
		}
		System.out.println(curr);
    }
}
