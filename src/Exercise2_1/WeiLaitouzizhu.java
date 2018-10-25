package Exercise2_1;

import java.util.Scanner;

public class WeiLaitouzizhu {
	public static void main (String[] agre){
		//构造函数
		Scanner input = new Scanner(System.in);
		
		//获取值
		System.out.println("请输入投资金额: ");
		double amount = input.nextDouble();
		
		System.out.println("请输入利率: ");
		double rate = input.nextDouble();
		
		System.out.println("请输入年数: ");
		int year = input.nextInt();
		
		//计算并转换
		double weilaitouzijine = amount * Math.pow((1 + (rate/100)), (year * 12));	
		double vul = (double)Math.round(weilaitouzijine * 100) / 100;
		
		//输出结果
		System.out.println("未来投资金额是: " + vul);
	}
}
