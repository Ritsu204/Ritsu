package course44;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human human = new Human();
		
		//Humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);
		
		human.disp();
		human.dispWeight();
		
		human.eat("ハンバーガー", 1200);
		
		human.dispWeight();
		System.out.println();//改行
		
		Animal an = new Animal();
		an.setName("サイ");
		an.setWeight(70000000);
		an.setKari("角で相手を粉砕する。");
		an.setJumyou(30);
		
		an.display();
		an.death(an.getName());
		
	}

}
