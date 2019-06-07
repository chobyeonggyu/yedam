package oracle.com;

public class NewJavaProgram {

	public static void main(String [] args) {
		int result, num1, num2;
		num1= 10;
		num2= 20;
		result =num1 + (num2 *3 )+ (30/num1)-10;
		System.out.println(result);
		//bit operation ( &| ^~)
		int a = 15;
		int b = 20;
		result = a | b;
		System.out.println (a + " &"+ b+ '=' + result);
	}
}
