package Exercise2_1;

import java.util.Scanner;

public class WeiLaitouzizhu {
	public static void main (String[] agre){
		//���캯��
		Scanner input = new Scanner(System.in);
		
		//��ȡֵ
		System.out.println("������Ͷ�ʽ��: ");
		double amount = input.nextDouble();
		
		System.out.println("����������: ");
		double rate = input.nextDouble();
		
		System.out.println("����������: ");
		int year = input.nextInt();
		
		//���㲢ת��
		double weilaitouzijine = amount * Math.pow((1 + (rate/100)), (year * 12));	
		double vul = (double)Math.round(weilaitouzijine * 100) / 100;
		
		//������
		System.out.println("δ��Ͷ�ʽ����: " + vul);
	}
}
