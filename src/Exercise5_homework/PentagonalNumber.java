package Exercise5_homework;

public class PentagonalNumber {
	/*构建主方法*/
	public static void main(String[] agre){
		for (int i = 1;i < 100 ;i++){
			int jieguo = getPentagonalNumber(i);
			System.out.print(jieguo + " ");
			
			if (i%10==0){
				System.out.print('\n');
			}
		}
	}
	/*计算公式的调用*/
	public static int getPentagonalNumber(int n){
		return (n * (3 * n - 1) / 2);
					}
	}

