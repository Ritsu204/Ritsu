package course28;

public class Sample01 {

	public static void main(String[] args) {

		//インスタンス	
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。

		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ&ピース";
		
		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);
		System.out.println(); //改行
		
		//沼田パラメータ
		Chr numata = new Chr();
		numata.attack = 250;
		numata.def = 10;
		numata.spd = 200;
		numata.love = 0;
		numata.MP = 10;
		numata.HP = 30;
		
		//かじまパラメータ
		Chr kajima = new Chr();
		kajima.attack = 100;
		kajima.def = 90;
		kajima.spd = 250;
		kajima.love = 10;
		kajima.MP = 10;
		kajima.HP = 30;
		
kajima.naguru(kajima.attack,numata.def);	
		
		
		
		
	}
}
