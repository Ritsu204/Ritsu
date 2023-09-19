package course29;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//クラス「Human」から、インスタンス「Human1」を生成
		Human human1 = new Human();

		//human1にパラメータを設定
		human1.name = "システム太郎";
		human1.hobby = "基数変換";
		human1.address = "サーティファイ本社";

		//クラス「human」から、インスタンス「human2」を生成
		Human human2 = new Human();

		//human2にパラメータを設定
		human2.name = "システム花子";
		human2.hobby = "パック10進数";
		human2.address = "国際理工学園182号館";

		//クラス「human」から、インスタンス「me」を生成
		Human me = new Human();

		//meにパラメータを設定
		me.name = "立川";
		me.hobby = "ゲーム";
		me.address = "君津";

		//メソッド呼び出し
		human1.talk();
		human2.talk();
		me.talk();
		
		
		
	}

}
