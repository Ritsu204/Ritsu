package Class_Sogo_2;

import java.util.Random;

public class Trainer {

	String name;
	
	//図鑑用の配列
	Pocketon[] myPockes = new Pocketon[999];

	Trainer() {
		name = "";
	}

	int n = 0;

	//捕獲メソッド
	void capture(Pocketon pocke) {
		
		//乱数発生
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 1;

		//乱数と捕獲難易度が同じなら再抽選
		while (a == pocke.runaway) {
			a = rnd.nextInt(10) + 1;
		}

		if (a > pocke.runaway) {
			System.out.println("捕獲成功");
			myPockes[n] = pocke;
			n++;
		} else {
			System.out.println("捕獲失敗");

		}

	}

	//自分の図鑑のポケトンを表示するメソッド
	void display() {
		for (int i = 0; i < myPockes.length; i++) {
			if(myPockes[i] == null) {
				i=1000;
			}else {
				System.out.println(i+1+":"+myPockes[i].name);
			}
			
		}
	}
	
	
}
