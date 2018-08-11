import java.util.Scanner;
public class add1 {
int a,b,c;
void input() {
	System.out.println("enter values of a");
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println("enter values of b");
	int b = in.nextInt();
}
void add() {
	System.out.println("result="+c);
}
	public static void main(String[] args) {
		add1 ad=new add1();
        ad.input();
        ad.add();
	}

}
