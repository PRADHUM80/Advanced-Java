
import java.util.Scanner;

public class TryCatchBlocks {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			
			int c = a / b;
			
			System.out.println("Div res is : " + c);
			
			System.out.println("Enter the size of array : ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			
			System.out.println("Enter the Stored Elements to be stored in Array: ");
			int element = sc.nextInt();
			
			System.out.println("Enter an index at which elements to be stored: ");
			int index = sc.nextInt();
			arr[index] = element;
			
			System.out.println("Element has been Stored in Array");
			
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Connection is Terminated.");

	}

}

