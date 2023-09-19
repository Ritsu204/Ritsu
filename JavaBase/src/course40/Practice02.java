package course40;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①	
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();//改行
		System.out.println();

		//練習問題②
		for (int b = 1; b <= 100; b++) {
			if (b % 2 == 0) {
				System.out.println("現在" + b + "回目のループです。偶数です");
			}
		}
		System.out.println();//改行

		//練習問題③
		for (int c = 10; c >= 1; c--) {
			System.out.print(c + " ");
		}
		System.out.println();//改行
		System.out.println();
		
		//練習問題④
		int sum = 0;
		for(int d = 1; d<=100;d++) {
			sum = sum + d;
			
		}
		System.out.println(sum);
		System.out.println();//改行
		
		
		
		

	}

}
