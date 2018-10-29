package Exercise3;

import java.util.Random;
import java.util.Scanner;

public class XueXijiafa {
	public static void main (String[] agre){
		
		Scanner input = new Scanner(System.in);
		Random suijishu = new Random();
		int suijishu1 = suijishu.nextInt(101);
		suijishu1 = Math.abs(suijishu.nextInt() % 101);
		int suijishu2 = suijishu.nextInt(101);
		suijishu2 = Math.abs(suijishu.nextInt() % 101);
		
		System.out.println("请输入数字总和 : ");
		int Sum = input.nextInt();
		
		int Count = suijishu1 + suijishu2;
		if (Sum == Count){
			System.out.println("恭喜你算对了");
		}
		else{
			System.out.println("对不起算错了，答案是 ： " + Count + "\n" + "随机数1是： " + suijishu1 
					+ "\n" + "随机数2是 ：" + suijishu2);
		}
	}
}
