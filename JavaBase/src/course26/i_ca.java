package course26;

import java.util.Random;
import java.util.Scanner;

public class i_ca {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		int wincount = 0;
		int losecount = 0;
		int gamecount = 0;
		int syojikin = 1000;
		int gamestart = 0;

		System.out.println("ハイカード!");
		System.out.println("所持金は" + syojikin + "円");

		while (gamestart != 9999 && syojikin > 0) {
			gamecount = gamecount + 1;

			int b = card();

			System.out.println("カードは" + b + "です。");
			System.out.println("次のカードはこれよりも高い？低い？");
			System.out.println("高いと予想するなら「１」");
			System.out.println("低いと予想するなら「２」");
			int hl = stdIn.nextInt();
			System.out.println("現在のカード「" + b + "」");

			int c = card();
			System.out.println("次のカードは「" + c + "」でした");

			String d = syohai(hl, b, c);
			System.out.println(d);

			if (d.equals("WIN")) {
				System.out.println("的中しました");
				wincount = wincount + 1;
			} else {
				System.out.println("外れました");
				losecount = losecount + 1;
			}

			syojikin = syojikinM(syojikin, d);

			System.out.println("所持金は" + syojikin + "円です");

			int nn = 0;
			gamestart = END(nn);

		}
		System.out.println("終了");

		double ending = syouritsu(gamecount, wincount);
		System.out.println("勝率は" + ending + "%です");

		dispResult(gamecount, wincount, losecount);

	}

	/////////////////////////////////////////////////////////////////////////

	//所持金メソッド
	static int syojikinM(int a, String b) {
		int c = 0;
		if (b.equals("WIN")) {
			c = a * 2;
			return c;
		} else {
			c = a / 2;
			return c;
		}
	}

	//乱数１	
	static int card() {
		Random rnd = new Random();
		int c = rnd.nextInt(13) + 1;

		return c;
	}

	//勝敗
	static String syohai(int a, int b, int c) {
		Random rnd = new Random();

		if (b == c) {
			while (b == c) {
				System.out.println("もう一度抽選");
				b = rnd.nextInt(13) + 1;
				c = rnd.nextInt(13) + 1;
				System.out.println(b + "と" + c);
			}

			
		} else if (a == 1) {
			if (b > c) {
				return "LOSE";
			} else if (b < c) {
				return "WIN";
			}
		
		
		} else if (a == 2) {
			if (b > c) {
				return "WIN";
			} else if (b < c) {
				return "LOSE";
			}
		}
		
		return "";
		
	}

	//終了判断メソッド
	static int END(int n) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("続けますか？");
		int g = stdIn.nextInt();

		return g;
	}

	//勝率
	static double syouritsu(double a, double b) {
		double d = (b / a) * 100;
		return d;

	}

	//戦績管理
	static void dispResult(int a, int b, int c) {
		System.out.println("ゲーム数 " + a);
		System.out.println("勝利数 " + b);
		System.out.println("敗北数" + c);
	}

}
