package course41;

public class Food {

	String name;
	int price;
	
	void display() {
		System.out.println(name);
		System.out.println(price);
	}
	
	Food(String n ,int p){
		name = n;
		price = p;
	}
	
	
}
