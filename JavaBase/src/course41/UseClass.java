package course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//模擬テスト⑮
		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		
		pro1.display();
		System.out.println();//改行
		
		//模擬テスト⑯
		Food food = new Food("初期",0);
		food.display();
		
		food.name = "苺";
		food.price = 400;
		food.display();
		System.out.println();//改行
		
		
		//模擬テスト⑰
		Food[] menu = new Food[4];
		
		Food fd1 = new Food("人参",300);
		Food fd2 = new Food("パスタ",200);
		Food fd3 = new Food("レモン",150);
		Food fd4 = new Food("林檎",100);
		
		menu[0] = fd1;
		menu[1] = fd2;
		menu[2] = fd3;
		menu[3] = fd4;
		
		System.out.println(menu[0].name);
		System.out.println(menu[1].name);
		System.out.println(menu[2].name);
		System.out.println(menu[3].name);
		
		//模擬テスト　クラスEX
		
	
	
		
		
		
	}

}
