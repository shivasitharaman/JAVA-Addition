import java.util.Scanner;
public class C {

	 int a,b,c;
	    Scanner sc = new Scanner(System.in);

	    void input() {
	        System.out.println("Enter Two Numbers :");
	        a = sc.nextInt();
	        b = sc.nextInt();
	    }
	}

class D extends C {

    void add() {
        c= a + b;
    }

    void display() {
        System.out.println("The Sum is:"+c);
    }

public static void main(String args[]) {
    D obj = new D();

    obj.input();
    obj.add();
    obj.display();
}
}
