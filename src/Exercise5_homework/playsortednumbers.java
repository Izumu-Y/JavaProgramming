package Exercise5_homework;

import java.util.Scanner;

public class playsortednumbers {
	public static void main(String[] arge){
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter three number : " + "\n");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		displaysortednumbers(number1,number2,number3);
	}
	public static void displaysortednumbers(int num1,int num2,int num3){
		int temp = 0 ;
		if (num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;			
		}
		if (num1 > num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.print("排序后的结果是" + num1 + " " + num2 + " " + num3);
	}
}
