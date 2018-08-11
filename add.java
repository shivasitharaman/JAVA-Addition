import java.util.Scanner;
public class add {
public static void main(String[] args) {
		
		System.out.println("enter the value of a");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("enter the value of b");
		int b = in.nextInt();
		int c;
		c=a+b;
		System.out.println("the value of c="+c);
	}

}