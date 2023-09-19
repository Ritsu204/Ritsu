package course30;

public class Drink {

	int price;
	String name;
	
	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをしたときに自動的に発動する
	
	Drink(int p,String n){
		price = p;
		name = n;
	}
	
	
	
	void display() {
		System.out.println("price   :"+price + "円");
		System.out.println("name    :"+name);
	}
	
	
	
	
	
	
	
	
	
}
