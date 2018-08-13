import java.util.Scanner;
public interface first {

	void input();
	void add();
}

class tot implements first{
	int a,b,c;
    Scanner sc=new Scanner(System.in);
    
    public void input() {
    	System.out.println("enter the a value");
    	int a=sc.nextInt();
    	System.out.println("enter the b value");
    	int b=sc.nextInt();
    }
    
   public void add() {
    	c=a+b;
    }
    
    public void display() {
    	
    	System.out.println("the sum of two nos="+c);
    }
    
    public static void main(String[] args) {
    	
    	 tot t1=new tot();
    	 t1.input();
         t1.add();
         t1.display();
    }
}

