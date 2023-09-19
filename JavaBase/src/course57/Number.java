package course57;

import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("数当てをします");
		System.out.println();//改行
		
		//乱数発生①
		int number = rnd.nextInt(100) + 1;
		
		//selectnum 及び kaisu 初期化
		int selectnum = 101;
		int kaisu = 0;

		while (number != selectnum) {
			//何回目か数える③
			kaisu = kaisu + 1;

			System.out.println("1～100までの自然数を1つ選んでください");
			selectnum = stdIn.nextInt();//②

			if (selectnum < number) {
				System.out.println("答えはもっと大きい数字です");
				//④
			}

			if (selectnum > number) {
				System.out.println("答えはもっと小さい数字です");
				//④
			}

			if (selectnum == number) {
				System.out.println("当たりました");
			}
			
			System.out.println();//改行

		}

		System.out.println(kaisu + "回目で終わりました");

	}

}
