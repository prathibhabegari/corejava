import java.util.*;
public class TestArr1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  the size of Array:");
	//int[] arr;
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	System.out.println("Elements in the Array:");
	for(int i=0;i<n;i++){
	System.out.println(arr[i] + " ");
	}
}
}
