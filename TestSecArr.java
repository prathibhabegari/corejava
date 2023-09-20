import java.util.*;
public class TestSecArr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println("2D Array is:"+arr[i][j]);
			}
		}
}
}
			