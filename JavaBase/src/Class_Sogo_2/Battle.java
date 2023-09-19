package Class_Sogo_2;

import java.util.Random;
import java.util.Scanner;

public class Battle {

	Scanner stdIn = new Scanner(System.in);
	Random rnd = new Random();

	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2, String player) {
		//特殊仕様////////////////////////////////////////////////

		//////////////////////////////////////////////////////////////

		int select = 0;
		System.out.println(poke2.name+"が現れた!!");

		while ((poke1.HP > 0 && poke2.HP > 0) && select != 99) {
			System.out.println(poke1.name + "はどうする");
			System.out.println("1.こうげき 2.まほう 99.にげる ");
			select = stdIn.nextInt();
			int judge = rnd.nextInt(2) + 1;

			if (poke1.speed > poke2.speed) {//poke1が速い
				Pocketon a = poke1;
				Pocketon b = poke2;
				System.out.println(a.name + "が先制した");
			} else if (poke1.speed < poke2.speed) {//poke2が速い
				Pocketon a = poke2;
				Pocketon b = poke1;
				System.out.println(a.name + "が先制した");

			} else if (judge == 1) {//同じ速さ
				//poke1が先制
				Pocketon a = poke1;
				Pocketon b = poke2;
				System.out.println(a.name + "が先制した");

			} else if (judge == 2) {//同じ速さ
				//poke2が先制
				Pocketon a = poke2;
				Pocketon b = poke1;
				System.out.println(a.name + "が先制した");

			}

			
			switch (select) {

			case 1:
				int dame ;
				
				break;

			case 2:
				dame = 0;
				
				
				break;

				
				
				
				
			case 99:
				System.out.println(player + "は逃げ出した");
				break;

			default:

				break;

			}

			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println();//改行

			//1が有利////////////////////////////////////////////////////////////

			//炎,草,水 三すくみ/////////////////////////////////////////////////////
			if (poke1.type.equals("炎") && poke2.type.equals("草")) {
				poke1.power = poke1.power * 2;
			}

			if (poke1.type.equals("草") && poke2.type.equals("水")) {
				poke1.power = poke1.power * 2;
			}

			if (poke1.type.equals("水") && poke2.type.equals("炎")) {
				poke1.power = poke1.power * 2;
			}

			//地,電,飛 三すくみ////////////////////////////////////////////////////
			if (poke1.type.equals("地") && poke2.type.equals("電")) {
				poke1.power = poke1.power * 2;
			}

			if (poke1.type.equals("電") && poke2.type.equals("飛")) {
				poke1.power = poke1.power * 2;
			}

			if (poke1.type.equals("飛") && poke2.type.equals("地")) {
				poke1.power = poke1.power * 2;
			}

			///////////////////////////////////////////////////////////////////////

			//2が有利

			//炎,草,水 三すくみ/////////////////////////////////////////////////////
			if (poke2.type.equals("炎") && poke1.type.equals("草")) {
				poke2.power = poke2.power * 2;
			}

			if (poke2.type.equals("草") && poke1.type.equals("水")) {
				poke2.power = poke2.power * 2;
			}

			if (poke2.type.equals("水") && poke1.type.equals("炎")) {
				poke2.power = poke2.power * 2;
			}

			//地,電,飛 三すくみ////////////////////////////////////////////////////

			if (poke2.type.equals("地") && poke1.type.equals("電")) {
				poke2.power = poke2.power * 2;
			}

			if (poke2.type.equals("電") && poke1.type.equals("飛")) {
				poke2.power = poke2.power * 2;
			}

			if (poke2.type.equals("飛") && poke1.type.equals("地")) {
				poke2.power = poke2.power * 2;
			}

		}

		//勝敗判定/////////////////////////////////////////////////////////
		if (poke1.power > poke2.power) {
			winner = poke1.name;
			return winner;
		} else if (poke2.power > poke1.power) {
			winner = poke2.name;
			return winner;
		} else {
			winner = "なし";
			return winner;
		}

	}

}
