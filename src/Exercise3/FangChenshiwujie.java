package Exercise3;

import java.util.Scanner;

public class FangChenshiwujie {
	public static void main(String[] arge){
		//���캯��
			Scanner input = new Scanner(System.in);
			
		//�������ʽģ��
			System.out.println("Please enter ax + by = e,cx + dy = f");
		
		//�����ʾ�������	
			System.out.println("Please enter a : ");
			double a = input.nextDouble();
			System.out.println("Please enter b : ");
			double b = input.nextDouble();
			System.out.println("Please enter c : ");
			double c = input.nextDouble();
			System.out.println("Please enter d : ");
			double d = input.nextDouble();
			System.out.println("Please enter e : ");
			double e = input.nextDouble();
			System.out.println("Please enter f : ");
			double f = input.nextDouble();
			
		//�����ֵ���ж�
			double cha = a * d - b * c;
			
			if(cha == 0){
				System.out.println("The equation has no solution");
			}
			else{
				double x = (e * d - b * f) / (a * d - b * c);
				double y = (a * f - e * c) / (a * d - b * c);
		
		//������ 
			System.out.println("x is : " + x + " y is : " + y );
			}
	}
}
