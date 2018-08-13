import java.util.Scanner;
public interface sum {

	void input();
	void add();
}

class test implements sum{
	
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		
		 a=sc.nextInt();
		 b=sc.nextInt();
		
	}
	
	public void add() {
		
	   c=a+b;
	}
	
	void display() {
		
		System.out.println("the sum is ="+c);
	}
	
	public static void main(String args[]) {
		
		test t1=new test();
		t1.input();
		t1.add();
		t1.display();
	}
}
