import java.util.*;
public class demostack{
public static void main(String args[]){
Stack<String> s=new Stack<String>();
s.push("Pandu");
s.push("Laddu");
s.push("Sonu");
s.push("Monu");
s.push("Chotu");
Iterator<String>i=s.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
s.pop();
System.out.println("After pop");
Iterator<String> i2=s.iterator();
while(i2.hasNext()){
System.out.println(i2.next());
}
}
}