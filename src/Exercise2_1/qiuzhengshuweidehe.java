package Exercise2_1;

import java.util.Random;;

public class qiuzhengshuweidehe {
	public static void main (String[] ager){
		//生成一个随机数
		Random suijishu = new Random();
		int suijishu1 = suijishu.nextInt(1001);
		suijishu1 = Math.abs(suijishu.nextInt() % 1001);
		
		//取各位数
		int geweishu = suijishu1 % 10;
		int shiweishu = (suijishu1 / 10) % 10;
		int baiweishu = (suijishu1 / 100 ) % 10;
		int qianweishu = (baiweishu / 1000) % 10;
		
		//计算总和
		int zonghe = geweishu + shiweishu + baiweishu + qianweishu;
		
		//输出结果
		System.out.println("生成的随机数是 : " + suijishu1 +"\n" + "各位数的总和是 : " + zonghe);
	}
}
