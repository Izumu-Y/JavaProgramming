package Exercise2_1;

import java.util.Scanner; 

public class JiSuanxiaofei {
	public static void main (String[] arge){
		//	构造输入函数 
		Scanner input = new Scanner(System.in);
		
		//	构造默认值
		final double Remuneration_rate = 0.15;
		
		//	提示用户输入
		System.out.println("请输入费用 ($): ");
		
		//	输入赋值
		double shuruzhi = input.nextDouble();
		
		//	计算费用：输入值 * (1+酬金率）
		double jieguo = shuruzhi * (1 + Remuneration_rate);
		
		//	输出结果
		System.out.println("您需要支付 : " + jieguo + "$");		
	}
}
