import java.util.*;

class InputTest{

	public static void main(String a[]){
		float  i,j;	
		double f;	
		Scanner  myobj1 = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		i = myobj1.nextInt();
		
		System.out.println("Enter 2nd number:");
		j = myobj1.nextInt();
		f =  ((i/j));
		System.out.println("Addition is:"+((i+j)));
		System.out.println("Subtraction is:"+((i-j)));
		System.out.println("Multiplication is:"+((i*j)));
		System.out.println("Division  is:"+f);
	}	
}
 
