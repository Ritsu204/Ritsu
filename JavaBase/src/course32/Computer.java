package course32;

public class Computer {

	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;

	Computer(String n, String c, int m,
			String g, int p) {
		name = n;
		cpu = c;
		memory = m;
		gurabo = g;
		price = p;

	}

	int nebiki(int nebikigaku) {
		int x = price - nebikigaku;

		return x;

	}

	void display() {
		System.out.println("name: " + name);
		System.out.println("cpu: " + cpu);
		System.out.println("memory: " + memory);
		System.out.println("gurabo: " + gurabo);
		System.out.println("price: " + price);
	}

	int chonebiki(int nebikigaku) {
		int modori = price - (nebikigaku * 3);
		
		return modori;
	}

}
