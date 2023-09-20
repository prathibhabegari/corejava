import java.util.*;
public class Test{
	public static void main(String a[]){
	char ca;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 subjects marks:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int n5=sc.nextInt();
	int total=n1+n2+n3+n4+n5;
	System.out.println("Total:"+total);
	double p=(double)(total/500)*100;
	System.out.println("Percantage:"+p);
	if(p<=100 && p>=75){
	ca='A';
	}else if(p<75 && p>=60){
	ca='B';
	}else if(p<60 && p>=50){
	ca='C';
	}
	else{
	ca='D';
	}
	switch(ca){
		case'A':
			System.out.println("Outstanding");
		break;
		case'B':
			System.out.println("Excellent");
		break;
		case'C':
			System.out.println("Good");
		break;
		case'D':
			System.out.println("Try Again");
			
			
		Default:
			System.out.println("Invalid");
			break;
	}
}
}