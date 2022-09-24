import java.util.Scanner;

public class binary {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
try
{
		
		sc= new Scanner(System.in);

		System.out.print("Please Enter Binary Number =  ");
		String binaryString = sc.nextLine();
	
		int decimalVal = Integer.parseInt(binaryString, 2);
		System.out.println("Binary To Decimal Result = " + decimalVal);  
        
           String OctalVal = Integer.toOctalString(decimalVal);
		System.out.println("Binary To Octal Result     = " + OctalVal);
    }
catch(Exception e){
System.out.println("invalid input");
}
}
}
