package oracle.com;

public class TestSample {

	public static void main(String[] args) {
		int num = 1;

		int sum = 0;
		while (num <= 100) {
			if ((num % 2) == 0 && (num % 7) == 0) {
				System.out.println(num);
				
				sum = num + sum;
			}
			num++;//num=num+1
		}
		System.out.println(sum);
	}

}
