import java.util.Scanner;

class ClassTest2{
	
	int x,y;

	Scanner jas1  =  new Scanner(System.in);
	
	void inputData(){
		System.out.println("Enter 1st number x: ");
		this.x = jas1.nextInt();
		System.out.println("Enter 2nd number y: ");
		this.y = jas1.nextInt();
	}
	
	void showOutput(){
		System.out.println("Addition is "+(x+y));
	}	
	public static void main(String a[]){
	
		ClassTest2  myobj1  = new ClassTest2();	

		myobj1.inputData();
		myobj1.showOutput();
	}
}
