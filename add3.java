public abstract class add3 {

	abstract void sum();
};

class A extends add3
{
	void sum()
	{
		int a,b,c;
		a=10;
		b=15;
		c=a+b;
		System.out.println("the sum of two values="+c);
	}
};

class B extends add3
{
	void sum()
	{
		float a,b,c;
		a=1.5f;
		b=2.5f;
		c=a+b;
		System.out.println("the sum of two values="+c);
	}
};

class total{
	
	public static void main(String[] args) {
	
		A o1=new A();
		o1.sum();
		B o2=new B();
		o2.sum();
	}
}
