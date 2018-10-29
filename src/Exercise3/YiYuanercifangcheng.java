package Exercise3;

import java.util.Scanner;

public class YiYuanercifangcheng {
	public static void main (String[] agre){
		//构造函数
		Scanner input = new Scanner(System.in);
		
		//传入参数
		System.out.println("ax^2+bx+c=0");
		System.out.println("请输入a的值: ");
		double a = input.nextDouble();
		System.out.println("请输入b的值: ");
		double b = input.nextDouble();
		System.out.println("请输入c的值: ");
		double c = input.nextDouble();
		
		//计算
		double r1 = (-b + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / 2;
		double r2 = (-b - Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / 2;
		
		double vul1 = (double)Math.round(r1 * 1000) / 1000;
		double vul2 = (double)Math.round(r2 * 1000) / 1000;
		
		//输出结果
		System.out.println("你输入的方程是" + (int)a + "x^2" + "+" + (int)b + "x" + "+" + (int)c + "=0" 
		+ "\n" + "解1 ：" + vul1 + "\n" + "解2 ：" + vul2 );
	}

}
