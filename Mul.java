import java.util.*;
public class Mul{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(n+" * "+i+" = "+n*i);
			i++;
		}
	}
}