package Exercise2_1;

import java.util.Random;;

public class qiuzhengshuweidehe {
	public static void main (String[] ager){
		//����һ�������
		Random suijishu = new Random();
		int suijishu1 = suijishu.nextInt(1001);
		suijishu1 = Math.abs(suijishu.nextInt() % 1001);
		
		//ȡ��λ��
		int geweishu = suijishu1 % 10;
		int shiweishu = (suijishu1 / 10) % 10;
		int baiweishu = (suijishu1 / 100 ) % 10;
		int qianweishu = (baiweishu / 1000) % 10;
		
		//�����ܺ�
		int zonghe = geweishu + shiweishu + baiweishu + qianweishu;
		
		//������
		System.out.println("���ɵ�������� : " + suijishu1 +"\n" + "��λ�����ܺ��� : " + zonghe);
	}
}
