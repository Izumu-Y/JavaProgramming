package Exercise5_homework;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] arge){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :" + "\n");
		int num = input.nextInt();
		
		if(num == getpalindrom(num)){
			System.out.print("你输入的数字是" + num + "\n" + "反向倒置数是" + getpalindrom(num) + "\n"+ "这是回文数字！");
		}
		else{
			System.out.print("你输入的数字是" + num + "\n" + "反向倒置数是" + getpalindrom(num) + "\n"+ "这不是回文数字！");
		}		
	}
	public static int getpalindrom(int number){
		int number1 = 0;
		while (number != 0){
			number1 = number1 * 10 + number % 10;
			number = number / 10;
		}
		return number1;
	}
}
