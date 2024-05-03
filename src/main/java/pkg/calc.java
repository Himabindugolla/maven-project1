package pkg;

public class calc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public void show()
	{
		System.out.println("Hello world");
		System.out.println("Hello world i am Hima Bindu Golla");
	}
	

	public static void main(String[] args) {
		calc cal = new calc();
	    System.out.println("sum is"+cal.sum(20,10));
	    System.out.println("diff is"+cal.diff(20,10));
	    System.out.println("mul is"+cal.mul(20,10));
	    cal.show();
		// TODO Auto-generated method stub

	}

}
