package Exercise5_homework;

import java.util.Scanner;

public class sumDigits {
	public static void main(String[] agre){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number : " + " \n");
		int i = input.nextInt(); 
		
		int number = getsumDigits(i);
		System.out.print("The sum is " + number);
	}
	public static int getsumDigits(int a){
		int sum = 0;
		int number = a;
		while(number!=0){
			sum+=number%10;
			number=number/10;
		}
		return sum;
		}
	}

