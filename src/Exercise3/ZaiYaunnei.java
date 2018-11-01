package Exercise3;

import java.util.Scanner;

public class ZaiYaunnei {
	public static void main (String[] agre){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入x坐标 ： ");
		double x = input.nextDouble();
		System.out.println("请输入y坐标 ： ");
		double y = input.nextDouble();
		
		double r = Math.pow((x * x + y * y),0.5);
		
		if (r <= 10){
			System.out.println("您输入的点在圆内");
		}else{
			System.out.println("您输入的点不在圆内");
		}
	}
}
