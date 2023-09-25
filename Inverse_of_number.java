import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String s[]=sc.next().split("");
		int arr[]= new int[s.length+1];
		for(int i=1;i<=s.length;i++){
			arr[Integer.parseInt(s[i-1])]=s.length-i+1;
		}
		StringBuilder s1 =new StringBuilder();
		for(int i=1; i<=s.length;i++)
			s1.append(arr[s.length-i+1]);
		System.out.println(s1);	
    }
}