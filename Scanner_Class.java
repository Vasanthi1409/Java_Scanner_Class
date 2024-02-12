package Scanner_Class.com;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in); 
		System.out.println("Enter byte value");
		byte byteval = SC.nextByte();
		System.out.println("Byte value is: "+byteval);
		System.out.println("Enter short value");
		short shortval = SC.nextShort();
		System.out.println("Short value is: "+shortval);
		System.out.println("Enter Int value");
		int intval = SC.nextInt();
		System.out.println("Int value is: "+intval);
		System.out.println("Enter Long value");
		long longval = SC.nextLong();
		System.out.println("Long value is: "+longval);
		System.out.println("Enter Float value");
		float floatval = SC.nextFloat();
		System.out.println("Float value is: "+floatval);
		System.out.println("Enter Double value");
		double doubleval = SC.nextDouble();
		System.out.println("Double value is: "+doubleval);
		System.out.println("Enter Boolean value");
		boolean booleanval = SC.nextBoolean();
		System.out.println("Boolean value is: "+booleanval);				
		System.out.println("Enter the Student Name");
		String name = SC.next();
		System.out.println("Student Name: "+name);
		SC.close();
	}
}
