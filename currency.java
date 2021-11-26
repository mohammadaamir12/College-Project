import java.util.*;
class currency{
public static void main (String agrs[]){
Scanner sc=new Scanner(System.in);
int day=sc.nextInt();
int month=sc.nextInt();
int year=sc.nextInt();
sc.close();
Calendar cal = Calendar.getInstance();
cal.set(Calendar.MONTH,month-1);
cal.set(Calendar.DAY_OF_MONTH,day);
cal.set(Calendar.YEAR,year);
String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
System.out.println(dayOfWeek);

}
}