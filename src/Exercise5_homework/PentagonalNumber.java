package Exercise5_homework;

public class PentagonalNumber {
	/*����������*/
	public static void main(String[] agre){
		for (int i = 1;i < 100 ;i++){
			int jieguo = getPentagonalNumber(i);
			System.out.print(jieguo + " ");
			
			if (i%10==0){
				System.out.print('\n');
			}
		}
	}
	/*���㹫ʽ�ĵ���*/
	public static int getPentagonalNumber(int n){
		return (n * (3 * n - 1) / 2);
					}
	}

