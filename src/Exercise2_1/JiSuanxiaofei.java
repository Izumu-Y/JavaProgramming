package Exercise2_1;

import java.util.Scanner; 

public class JiSuanxiaofei {
	public static void main (String[] arge){
		//	�������뺯�� 
		Scanner input = new Scanner(System.in);
		
		//	����Ĭ��ֵ
		final double Remuneration_rate = 0.15;
		
		//	��ʾ�û�����
		System.out.println("��������� ($): ");
		
		//	���븳ֵ
		double shuruzhi = input.nextDouble();
		
		//	������ã�����ֵ * (1+����ʣ�
		double jieguo = shuruzhi * (1 + Remuneration_rate);
		
		//	������
		System.out.println("����Ҫ֧�� : " + jieguo + "$");		
	}
}
