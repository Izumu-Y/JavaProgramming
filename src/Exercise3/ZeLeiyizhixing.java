package Exercise3;

import java.util.Scanner;

public class ZeLeiyizhixing {
	public static void main(String[] agre){
		//构造函数
		Scanner input = new Scanner(System.in);
		
		//传入值
		System.out.println("Enter year : ");
		int year = input.nextInt();
		System.out.println("Enter month : ");
		int month = input.nextInt();
		System.out.println("Enter day: ");
		int day = input.nextInt();
		
		//泽勒一致性公式
		int h = (day + ( 26 * (month + 1) / 10) + year % 100 + (year % 100) / 4 
				+ year / 100 /4 + 5 * (year / 100)) % 7;
		//根据计算输出结果
		switch(h){
		case 0 : System.out.println("The day is Saturday");
		break;
		case 1 : System.out.println("The day is Sunday");
		break;
		case 2 : System.out.println("The day is Monday");
		break;
		case 3 : System.out.println("The day is Tuesday");
		break;
		case 4 : System.out.println("The day is Wednesday");
		break;
		case 5 : System.out.println("The day is Thursday");
		break;
		case 6 : System.out.println("The day is Friday");
		break;
		}		
	}
}
