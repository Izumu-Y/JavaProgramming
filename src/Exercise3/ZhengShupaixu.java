package Exercise3;

import java.util.Scanner;
import java.util.Arrays;

public class ZhengShupaixu {
	public static void main (String[] arge){
		
		Scanner input = new Scanner(System.in);
		int[] MyList = new int[3]; 
		
		System.out.println("������a �� ");
		int a = input.nextInt();
		System.out.println("������b �� ");
		int b = input.nextInt();
		System.out.println("������c �� ");
		int c = input.nextInt();
		
		MyList[0] = a;
		MyList[1] = b;
		MyList[2] = c;
		
		Arrays.sort(MyList);
		for (int i = 0;i < MyList.length;i++){
			System.out.println(MyList[i] +" " );
		}
	}
}
