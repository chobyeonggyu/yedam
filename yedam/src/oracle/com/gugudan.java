package oracle.com;

import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 단을 입력하세요");
		int b= sc.nextInt();
		System.out.println(" 단을 입력하세요");
		int c= sc.nextInt();
		gugudan(b,c);
		
			
	}
    public static void gugudan(int a,int d) {
    	int i=1;
    	while (i<=9) {
    		System.out.println(a +" * " + i +" = " +(a*i));
    		i++;
    		int j=1;
    		while  (j<=9) {
    			System.out.print(d +" *"+ j +"="  +(d*j));
    			j++;
    			
    		}
    	}
    
    }
}
