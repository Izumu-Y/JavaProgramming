package Exercise3;

import java.util.Scanner;

public class YiYuanercifangcheng {
	public static void main (String[] agre){
		//���캯��
		Scanner input = new Scanner(System.in);
		
		//�������
		System.out.println("ax^2+bx+c=0");
		System.out.println("������a��ֵ: ");
		double a = input.nextDouble();
		System.out.println("������b��ֵ: ");
		double b = input.nextDouble();
		System.out.println("������c��ֵ: ");
		double c = input.nextDouble();
		
		//����
		double r1 = (-b + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / 2;
		double r2 = (-b - Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / 2;
		
		double vul1 = (double)Math.round(r1 * 1000) / 1000;
		double vul2 = (double)Math.round(r2 * 1000) / 1000;
		
		//������
		System.out.println("������ķ�����" + (int)a + "x^2" + "+" + (int)b + "x" + "+" + (int)c + "=0" 
		+ "\n" + "��1 ��" + vul1 + "\n" + "��2 ��" + vul2 );
	}

}
