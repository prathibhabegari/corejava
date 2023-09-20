import java.util.*;
public class PosNeg{
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>0)
	{
	System.out.println("The number is a positive number");
	}
	else if(n<0)
	{
	System.out.println("The number is a negative number");
	}
	else{
	System.out.println("The number is zero");
	}
}
}