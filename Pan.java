package Exception;
import java.util.*;
class Invalidpan extends RuntimeException
{
	public String toString()
	{
		return "INVALID PAN INFORMATION AND MOBLIE NO::";
	}
}
public class Pan {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER PAN NO:");
			String pno=sc.next();
			System.out.println("ENTER MOBILE NO:");
			String mno=sc.next();
			if(pno.length()!=10)
				throw new Invalidpan();
			for(int i=0;i<5;i++)
				if(!Character.isUpperCase(pno.charAt(i)))
					throw new Invalidpan();
			for(int i=5;i<9;i++)
				if(!Character.isDigit(pno.charAt(i)))
					throw new Invalidpan();
			if(!Character.isUpperCase(pno.charAt(9)))
				    throw new Invalidpan();
			
			for(int i=0;i<10;i++)
				if(!Character.isDigit(mno.charAt(i)))
					throw new Invalidpan();
			if(mno.length()!=10)
				    throw new Invalidpan();
			
			System.out.println("PAN NO:"+pno);
			System.out.println("MOBILE NO:"+mno);
		}
		catch(Exception e)
		{
			System.out.println("Error="+e);
		}
	}

}