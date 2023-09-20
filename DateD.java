import java.util.*;
public class DateD{
	public static void main(String a[]){
	Date d=new Date();
	SimpleDateFormat f = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	System.out.println("Current Date:"+f.format(d));
}
}