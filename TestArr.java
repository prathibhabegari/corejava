import java.util.*;
public class TestArr{
	public static void main(String a[]){
		double[] myList = {1.9,2.9,3.4,3.5};
		for(int i=0;i<myList.length;i++){
			System.out.println(myList[i]+ ",");
		}
		double t=0;
		for(int i=0;i<myList.length;i++){
			t+=myList[i];
		}
		System.out.println("Total is:" +t);
		//double max=myList[0];
	}
}
		