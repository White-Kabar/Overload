
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(data(1, 2));
		System.out.println(data(1.5, 2));
		System.out.println(data(1.5 , 2.5));
		System.out.println(data(1, 2.5));
		System.out.println(data(1,2,3));
		System.out.println(data(1.5,2.5,3.5));
		System.out.println(data('1','2'));
	}
	public static int data(int a, int b) {
		return a + b;
	}
	public static double data(double a, int b) {
		return a + b;
	}
	public static double data(double a, double b) {
		return a + b;
	}
	public static double data(int a, double b) {
		return a + b;
	}
	public static int data(int a, int b, int c) {
		return a + b + c;
	}
	public static double data(double a, double b, double c) {
		return a + b + c;
	}
	public static int data(char a, char b) {
		return (a + b);
	}

}
