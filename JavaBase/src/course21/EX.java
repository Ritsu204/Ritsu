package course21;

import java.util.Scanner;

public class EX {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

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
		System.out.println("1:地震件数 2:台風件数 3:降水量 4:全て");
		int b = stdIn.nextInt();

		switch (b) {

		case 1:
			System.out.println("年別か月別を選んでください");
			System.out.println("1:年別 2:月別 3:年別(大きい順)");
			int c = stdIn.nextInt();
			if (c == 1) {
				int gg = 0;
				for (int g = 0; g < 12; g++) {
					gg = quake[g] + gg;
				}
				System.out.println("１年間に起こった地震の総件数は" + gg + "件です。");
			} else if (c == 2) {
				System.out.println("見たい月を入力してください");
				int ggg = stdIn.nextInt();
				System.out.println(ggg + "月" + quake[ggg - 1] + "件です。");
			} else if(c == 3) {
				for (int g1 = 100; g1 < 200; g1++) {
					for (int g2 = 0; g2 < 12; g2++) {
						if (g1 == quake[g2]) {
							System.out.println(g2 + 1 + "月は" + quake[g2] + "件です。");
						}
					}
				}
			}
			break;
		case 2:
			System.out.println("年別か月別を選んでください");
			System.out.println("1:年別 2:月別 3:年別(大きい順)");
			int d = stdIn.nextInt();
			if (d == 1) {
				int tt = 0;
				for (int t = 0; t < 12; t++) {
					tt = typhoon[t] + tt;
				}
				System.out.println("１年間に起こった台風の総件数は" + tt + "件です。");
			} else if (d == 2) {
				System.out.println("見たい月を入力してください");
				int ttt = stdIn.nextInt();
				System.out.println(ttt + "月" + typhoon[ttt - 1] + "件です。");
			} else if (d == 3) {
				for (int t1 = 0; t1 < 10; t1++) {
					for (int t2 = 0; t2 < 12; t2++) {
						if (t1 == typhoon[t2]) {
							System.out.println(t2 + 1 + "月は" + typhoon[t2] + "件です。");
						}
					}
				}
			}
			break;
		case 3:
			System.out.println("年別か月別を選んでください");
			System.out.println("1:年別 2:月別 3:年別(大きい順)");
			int e = stdIn.nextInt();
			if (e == 1) {
				int kk = 0;
				for (int k = 0; k < 12; k++) {
					kk = rain[k] + kk;
				}
				System.out.println("１年間の降水量はは" + kk + "mmです。");
			} else if (e == 2) {
				System.out.println("見たい月を入力してください");
				int kkk = stdIn.nextInt();
				System.out.println(kkk + "月" + rain[kkk - 1] + "mmです。");
			} else if (e == 3) {
				for (int k1 = 0; k1 < 500; k1++) {
					for (int k2 = 0; k2 < 12; k2++) {
						if (k1 == rain[k2]) {
							System.out.println(k2 + 1 + "月は" + rain[k2] + "mmです。");
						}
					}
				}
			}

			break;
		case 4:
			System.out.println("地震の件数");
			for (int f = 0; f < 12; f++) {
				System.out.println(f + 1 + "月の地震の件数は" + quake[f] + "件です。");
			}
			int ff = 0;
			for (int f = 0; f < 12; f++) {
				ff = ff + quake[f];
			}
			System.out.println("1年間の地震の件数は" + ff + "件です。");
			System.out.println();
			///////////////////////////////////
			System.out.println("台風の件数");
			for (int h = 0; h < 12; h++) {
				System.out.println(h + 1 + "月の台風の件数は" + typhoon[h] + "件です。");
			}
			int hh = 0;
			for (int h = 0; h < 12; h++) {
				hh = hh + typhoon[h];
			}
			System.out.println("1年間の台風の件数は" + hh + "件です。");
			System.out.println();
			///////////////////////////////////
			System.out.println("降水量");
			for (int i = 0; i < 12; i++) {
				System.out.println(i + 1 + "月の降水量は" + rain[i] + "mmです。");
			}
			int ii = 0;
			for (int i = 0; i < 12; i++) {
				ii = ii + rain[i];
			}
			System.out.println("1年間の降水量は" + ii + "mmです。");

		}

	}

}//nya^:^
