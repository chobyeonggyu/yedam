package oracle.com;

public class MethodSample {
	
	public static void main(String[] args) {
		double res = divide(3,5);
		System.out.println("결과값은"+ res);
	}
	public static int absMinus (int a, int b) {
		if (a>b) 
		return	a-b;
		else 
			return b-a;
	}
	public static double divide(double a, double b) {
	  if (b==0)
		  return 0;
	  else 
		  return a/b;
	}

}
