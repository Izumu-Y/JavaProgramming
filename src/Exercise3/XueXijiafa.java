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
		
		System.out.println("�����������ܺ� : ");
		int Sum = input.nextInt();
		
		int Count = suijishu1 + suijishu2;
		if (Sum == Count){
			System.out.println("��ϲ�������");
		}
		else{
			System.out.println("�Բ�������ˣ����� �� " + Count + "\n" + "�����1�ǣ� " + suijishu1 
					+ "\n" + "�����2�� ��" + suijishu2);
		}
	}
}
