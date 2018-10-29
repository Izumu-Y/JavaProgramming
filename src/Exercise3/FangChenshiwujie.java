package Exercise3;

import java.util.Scanner;

public class FangChenshiwujie {
	public static void main(String[] arge){
		//构造函数
			Scanner input = new Scanner(System.in);
			
		//输出方程式模板
			System.out.println("Please enter ax + by = e,cx + dy = f");
		
		//输出提示传入参数	
			System.out.println("Please enter a : ");
			double a = input.nextDouble();
			System.out.println("Please enter b : ");
			double b = input.nextDouble();
			System.out.println("Please enter c : ");
			double c = input.nextDouble();
			System.out.println("Please enter d : ");
			double d = input.nextDouble();
			System.out.println("Please enter e : ");
			double e = input.nextDouble();
			System.out.println("Please enter f : ");
			double f = input.nextDouble();
			
		//计算差值并判断
			double cha = a * d - b * c;
			
			if(cha == 0){
				System.out.println("The equation has no solution");
			}
			else{
				double x = (e * d - b * f) / (a * d - b * c);
				double y = (a * f - e * c) / (a * d - b * c);
		
		//输出结果 
			System.out.println("x is : " + x + " y is : " + y );
			}
	}
}
