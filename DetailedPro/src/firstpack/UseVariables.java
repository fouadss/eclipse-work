package firstpack;

public  class UseVariables {
	
	static int a;
	 static int b;
	static String name;
	static double salary;
	static int sum;
	
public UseVariables() {
		
		
		System.out.println(" this is training");
		
	}
	public  UseVariables(String name, int a,int b, double salary) {
		this.name=name;
		this.a=a;
		this.b=b;
		this.salary=salary;
		System.out.println(this.name+" "+this.a+" "+this.b+" "+this.salary);
	}
	
	public static void main(String[] args) {
		
		UseVariables abc= new UseVariables();
		
		 UseVariables def=new UseVariables("mahmud", 10, 20,1256.265);
		 
		
		
		
		
	}
	
	
	
	
	} 


