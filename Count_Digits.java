import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s[]=sc.next().split("");
		int check=sc.nextInt();
		int arr[]=new int[s.length];
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			arr[i]=Integer.parseInt(s[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==check)
				count++;
		}
		System.out.println(count);
    }
}