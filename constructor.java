import java.util.Scanner;
public class constructor {

	int s;
	constructor(){
		
		System.out.println("the sum of two nos is");
	}
	
	constructor(int a,int b){
		
		s=a+b;
	}
	
	void display() {
		
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a value :");
         int a=sc.nextInt();
         System.out.print("Enter b value :");
         int b=sc.nextInt();
         constructor c1=new constructor();
         constructor c2 = new constructor(a, b);
         c2.display();
	}
}
