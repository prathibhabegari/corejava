import java.util.*;
public class Maxnum{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>=n2 && n1>=n3){
			System.out.println(n1+"is max among three numbers");
		}
		else if(n2>=n1 && n2>=n3){
			System.out.println(n2+"is max among three numbers");
		}
		else{
			System.out.println(n3+"is max among three numbers");
		}
	}
}
	