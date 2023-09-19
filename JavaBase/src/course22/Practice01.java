package course22;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[][] ox = new String[3][3];

		ox[0][0] = "o";
		ox[0][1] = "x";
		ox[0][2] = "o";
		ox[1][0] = "x";
		ox[1][1] = "o";
		ox[1][2] = "x";
		ox[2][0] = "o";
		ox[2][1] = "o";
		ox[2][2] = "o";

		//練習問題①
		System.out.println(ox[2][1]);
		System.out.println();//改行

		//練習問題②
		System.out.println(Arrays.deepToString(ox));
		System.out.println();//改行
		
		int c = 0;
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.print(ox[a][b] + " , ");
				if (ox[a][b].equals("o")) {
					c++;
				}
			}
			System.out.println();
		}
		System.out.println("oの数は" + c + "個");
	}

}
