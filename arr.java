import java.util.*;
public class arr{
	public static void main(String args[]){
	ArrayList<String> l=new ArrayList<String>();
	l.add("Raju");
	l.add("Banu");
	l.add("Raj");
	l.add("Pranavi");
	Iterator i=l.iterator();
	while(i.hasNext()){
	System.out.println(i.next());
}
}
}