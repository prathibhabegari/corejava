import java.util.*;
public class OddEven{

	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n%2==0){
		System.out.println(n+"Entered Number is even");
		}
		else{
		System.out.println("Entered Number is odd");
		}
	}
}		