// this code will read an integer and display an integer.
import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
		public static void main(String arg[])
		{
				Scanner sc=new Scanner(System.in); // System.in is an object attached to keyboard, Scanner is a class, sc is object
				String x=sc.next(); // nextInt() is a method to read integer
				System.out.println(x);// System.out is an object attached to monitor. println is a method which will print and ln means move the cursor to next line.
		}
}

//scanner class is available in util package. import the util package.