package course21;

import java.util.Scanner;

public class jissyu01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//制作実習①
		int[] typhoon = new int[12];

		typhoon[0] = 1; //1月
		typhoon[1] = 1; //２月
		typhoon[2] = 0; //３月
		typhoon[3] = 0; //４月
		typhoon[4] = 0; //５月
		typhoon[5] = 1; //６月
		typhoon[6] = 4; //７月
		typhoon[7] = 5; //８月
		typhoon[8] = 6; //９月
		typhoon[9] = 4; //１０月
		typhoon[10] = 6; //１１月
		typhoon[11] = 1; //１２月

		System.out.println("７月は" + typhoon[6] + "件です。");
		System.out.println();//改行 

		//制作実習②
		for (int a = 0; a < 12; a++) {
			System.out.println(a + 1 + "月は" + typhoon[a] + "件です。");
		}
		System.out.println();//改行

		//作成実習③

		int[] quake = new int[12];
		quake[0] = 153; //1
		quake[1] = 127; // 2
		quake[2] = 130; //3
		quake[3] = 109; //4
		quake[4] = 118; //5
		quake[5] = 164; //6
		quake[6] = 130; //7
		quake[7] = 103; //8
		quake[8] = 103; //9
		quake[9] = 104; //10
		quake[10] = 123; //11
		quake[11] = 141; //12

		int[] rain = new int[12];
		rain[0] = 20; //1
		rain[1] = 58; //2
		rain[2] = 107; //3
		rain[3] = 87; //4
		rain[4] = 114; //5
		rain[5] = 187; //6
		rain[6] = 200; //7
		rain[7] = 59; //8
		rain[8] = 169; //9
		rain[9] = 441; //10
		rain[10] = 158; //11
		rain[11] = 94; //12

		Scanner stdIn = new Scanner(System.in);

		System.out.println("見たい情報を選んでください");
		System.out.println("1:台風件数 2:地震件数 3:降水量");
		int b = stdIn.nextInt();

		switch (b) {
		case 1:
			System.out.println("年別か月別を選んでください");
System.out.println("1:年別 2:月別");
			int c = stdIn.nextInt();
			if (c == 1) {
				int tt = 0;
				for(int t = 0; t<12; t++) {
					tt=typhoon[t]+tt;
				}System.out.println("１年間に起こった台風の総件数は"+tt+"件です。");

			}else {
				
			}

			break;
		case 2:
			break;
		case 3:
			break;
		}

	}

}
