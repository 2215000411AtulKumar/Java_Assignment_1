import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s[]=sc.next().split("");
		int a[]=new int[s.length];
		for(int i=0; i<s.length; i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		int even =0, odd=0;
		for(int i=a.length-1; i>=0; i--)
		{
			int pos=a.length-i+1;
			if(pos%2==0)
				even =even+a[i];
			else
				odd=odd+a[i];	
		}
		System.out.println(even);
		System.out.println(odd);
    }
}