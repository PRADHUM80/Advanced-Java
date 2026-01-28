import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		try 
		{
			
		System.out.println("Connection established");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		int c = a / b; //Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at ExceptionHandling/Exception.ExceptionIntro.main(ExceptionIntro.java:15)
		System.out.println(c);
		}
		catch(Exception e){
//			System.out.println("Excetion Handled");
			e.printStackTrace();
		}
		System.out.println("Connection terminated");

	}

}
