import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int i=2, flag=1;
		while(i<num/2)
		{
			if(num%i==0)
				flag=0;
				break;
		}
		if(flag==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	

    }
}