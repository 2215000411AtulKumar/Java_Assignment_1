import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.next().split("");
		int arr[] = new int[s.length];
		int sum =0; 
		for(int i=0; i<s.length; i++)
		{
			arr[i]=Integer.parseInt(s[i]);
		}
		for(int i=0; i<arr.length; i++){
			sum+=arr[i]*Math.pow(2,(s.length-1-i));
			}
		System.out.println(sum);

	}
}