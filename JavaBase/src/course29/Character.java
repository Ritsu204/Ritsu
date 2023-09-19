package course29;

import java.util.Random;
import java.util.Scanner;

public class Character {

	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP:" + hp);
		System.out.println("攻撃力:" + str);
		System.out.println("防御力:" + def);
		System.out.println("命中率:" + dex);
		System.out.println("回比率:" + agi);

	}

	void battle(Character player1, Character player2) {
		System.out.println(player1.name + "と" + player2.name + "の熱い戦いが始まる・・・！");
		System.out.println();//改行
		
		//hpが続く限り戦いを続けるための処理
		int gamecount = 1;
		while ((player1.hp > 0) && (player2.hp > 0) && (gamecount <= 100)) {

			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。

			int pl1agi = player1.agi;
			int pl2agi = player2.agi;

			System.out.println(gamecount+"ターン目");
			
			
			
			
			if (player1.agi == player2.agi) {

				Random rnd = new Random();
				int r = rnd.nextInt(2) + 1;

				if (r == 1) {
					player1.agi = player1.agi + 1;
				} else if (r == 2) {
					player2.agi = player2.agi + 1;
				}

			} if (player1.agi <= player2.agi) {
				dam(player1.hp,player2.str,player1.def,player1.name);
				if (player1.hp <= 0) {
					break;
				}

				dam(player2.hp,player1.str,player2.def,player2.name);
				System.out.println();//改行
				if (player2.hp <= 0) {
					break;
				}

			} if (player1.agi >= player2.agi) {
				dam(player2.hp,player1.str,player2.def,player2.name);
				if (player2.hp <= 0) {
					break;
				}

				dam(player1.hp,player2.str,player1.def,player1.name);
				System.out.println();//改行
				if (player1.hp <= 0) {
					break;
				}

			}

			if (player1.agi != pl1agi) {
				player1.agi = player1.agi - 1;
			}

			if (player2.agi != pl2agi) {
				player2.agi = player2.agi - 1;
			}

			gamecount++;
		}

		if (player1.hp <= 0) {
			System.out.println(player1.name + "は死亡した。だが、皆の記憶の中で生き続ける。");
		}

		if (player2.hp <= 0) {
			System.out.println(player2.name + "は死亡した。だが、皆の記憶の中で生き続ける。");
		}
		
		if(gamecount>=100) {
			System.out.println("試合終了");
		}
		
		

	}//nya

	// p1ha p2sb p1dc p1nd
	void dam(int a,int b,int c,String d) {
	
	a = a - (b - c);
	System.out.println(d + "に" + (b - c) + "ダメージ");
	System.out.println(d + "の残りHPは" + a);
	
	
	}
	
	
	String charname(String x) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println(x + "の名前を入力");
		String a = stdIn.next();

		return a;
	}

	int status(String x, String y) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println(x + "の" + y + "の数値を入力");

		int a = stdIn.nextInt();

		return a;

	}

}
