package Exercise5_homework;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] arge){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :" + "\n");
		int num = input.nextInt();
		
		if(num == getpalindrom(num)){
			System.out.print("�������������" + num + "\n" + "����������" + getpalindrom(num) + "\n"+ "���ǻ������֣�");
		}
		else{
			System.out.print("�������������" + num + "\n" + "����������" + getpalindrom(num) + "\n"+ "�ⲻ�ǻ������֣�");
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
