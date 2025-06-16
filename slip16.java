package Slips;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class slip16 
{
	Date now=new Date();
	Calendar cal= Calendar.getInstance();

	public static void main(String[] args) 
	{
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2=new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat format3=new SimpleDateFormat("EEEE MMMM dd yyyy");
		SimpleDateFormat format4=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
		SimpleDateFormat format5=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a Z");
		SimpleDateFormat format6=new SimpleDateFormat("HH:mm:ss");
		System.out.println("Current date is:"+format1.format(now));
		System.out.println("Current date is:"+format2.format(now));
		System.out.println("Current date is:"+format3.format(now));
		System.out.println("Current date is:"+format4.format(now));
		System.out.println("Current date is:"+format5.format(now));
		System.out.println("Current date is:"+format6.format(now));
		

	}

}
