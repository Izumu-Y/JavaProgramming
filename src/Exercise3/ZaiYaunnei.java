package Exercise3;

import java.util.Scanner;

public class ZaiYaunnei {
	public static void main (String[] agre){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������x���� �� ");
		double x = input.nextDouble();
		System.out.println("������y���� �� ");
		double y = input.nextDouble();
		
		double r = Math.pow((x * x + y * y),0.5);
		
		if (r <= 10){
			System.out.println("������ĵ���Բ��");
		}else{
			System.out.println("������ĵ㲻��Բ��");
		}
	}
}
