class ClassObjectTest{       // Essential

	int i=5,j=6,k;   // member variable
//----------------Member method--------------------
	int calc(int x,int y){
	System.out.println("2. I am inside calc function Now \n");
		this.i = x;
		this.j = y;
		return (i*j);
	}
	
	void showOutput(){
		System.out.println("Multiplication are: "+k);
	}
	public static void main(String a[]){

	System.out.println("0. I am first line of Execution \n");
		ClassObjectTest  obj1 = new ClassObjectTest();
	System.out.println("1. I am calling calc function \n");
		int result = obj1.calc(7,9);
	System.out.println("3. I am back inside main function and submit result.\n");
		System.out.println("Result are "+result);
		
		//obj1.showOutput();
	}
}
